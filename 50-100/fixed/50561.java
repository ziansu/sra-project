@java.lang.Override
public java.lang.Boolean getBooleanProp(java.lang.String propertyName) throws org.owasp.esapi.errors.ConfigurationException {
    for (org.owasp.esapi.configuration.AbstractPrioritizedPropertyLoader loader : loaders) {
        try {
            return loader.getBooleanProp(propertyName);
        } catch (org.owasp.esapi.errors.ConfigurationException e) {
        }
    }
    throw new org.owasp.esapi.errors.ConfigurationException((("Could not find property " + propertyName) + " in configuration"));
}