@java.lang.Override
public java.lang.String getProperty(final java.lang.String key, final java.lang.ClassLoader cl) {
    final java.lang.String propertyValueFromFile = fileResolver.getProperty(key, cl);
    java.lang.String propertyValue = null;
    if (propertyValueFromFile != null) {
        propertyValue = jndiPropertyResolver.getProperty(propertyValueFromFile, cl);
    }
    return propertyValue;
}