protected void loadConfigurations(com.linkedpipes.etl.executor.api.v1.rdf.SparqlSelect runtimeConfig) throws com.linkedpipes.etl.executor.api.v1.RdfException {
    for (java.lang.reflect.Field field : component.getClass().getFields()) {
        if ((field.getAnnotation(Component.Configuration.class)) != null) {
            loadConfigurationForField(field, runtimeConfig);
        }
    }
}