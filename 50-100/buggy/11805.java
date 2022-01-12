private <T> java.lang.Object getFieldValue(T classObject, java.lang.String fieldName) throws org.wso2.carbon.config.ConfigurationException {
    java.lang.reflect.Field field = getClassField(classObject, fieldName);
    try {
        return field.get(classObject);
    } catch (java.lang.IllegalAccessException e) {
        throw new org.wso2.carbon.config.ConfigurationException(java.lang.String.format(java.util.Locale.ENGLISH, "Error in obtaining value for field %s in %s", fieldName, classObject.getClass()));
    }
}