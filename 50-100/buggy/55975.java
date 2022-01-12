@java.lang.Override
public T build() throws io.dropwizard.configuration.ConfigurationException, java.io.IOException {
    try {
        final com.fasterxml.jackson.databind.JsonNode node = mapper.valueToTree(klass.getConstructor().newInstance());
        return build(node, "default configuration");
    } catch (java.lang.InstantiationException | java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException | java.lang.NoSuchMethodException | java.lang.SecurityException e) {
        throw new java.lang.IllegalArgumentException(((("Unable create an instance " + "of the configuration class: '") + (klass.getCanonicalName())) + "'"), e);
    }
}