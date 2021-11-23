private <T> java.lang.Object getFieldValue(T classObject, java.lang.reflect.Field field) throws org.wso2.carbon.config.ConfigurationException {
    try {
        return field.get(classObject);
    } catch (java.lang.IllegalAccessException e) {
        throw new org.wso2.carbon.config.ConfigurationException(java.lang.String.format(java.util.Locale.ENGLISH, "Error in obtaining value for field %s in %s", field.getName(), classObject.getClass()));
    }
}