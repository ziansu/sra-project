private synchronized org.restlet.ext.apispark.internal.model.Definition getDefinition() {
    if ((definition) == null) {
        synchronized(org.restlet.ext.swagger.JaxRsApplicationSwaggerSpecificationRestlet.class) {
            definition = org.restlet.ext.apispark.internal.introspection.jaxrs.JaxRsIntrospector.getDefinition(application, baseRef, false, null, null);
            if ((definition.getVersion()) == null) {
                definition.setVersion(((apiVersion) != null ? apiVersion : "1.0"));
            }
        }
    }
    return definition;
}