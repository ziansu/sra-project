@java.lang.Override
public int getIntProp(java.lang.String propertyName) throws org.owasp.esapi.errors.ConfigurationException {
    for (org.owasp.esapi.configuration.AbstractPrioritizedPropertyLoader loader : loaders) {
        try {
            return loader.getIntProp(propertyName);
        } catch (org.owasp.esapi.errors.ConfigurationException e) {
        }
    }
    throw new org.owasp.esapi.errors.ConfigurationException((("Could not find property " + propertyName) + " in configuration"));
}