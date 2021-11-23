private void persistPropertyToDatabase(org.zanata.action.ServerConfigurationBean.PropertyWithKey<java.lang.String> property) {
    org.zanata.model.HApplicationConfiguration registerUrlValue = applicationConfigurationDAO.findByKey(property.getKey());
    try {
        org.zanata.rest.service.ServerConfigurationService.persistApplicationConfig(property.getKey(), registerUrlValue, property.get(), applicationConfigurationDAO);
    } catch (java.lang.IllegalAccessException e) {
        e.printStackTrace();
    } catch (java.lang.NoSuchMethodException e) {
        e.printStackTrace();
    } catch (java.lang.reflect.InvocationTargetException e) {
        e.printStackTrace();
    }
}