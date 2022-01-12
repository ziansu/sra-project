public com.smartbear.swagger.SwaggerImporter importSwaggerDefinition(final com.eviware.soapui.impl.wsdl.WsdlProject project, final java.lang.String definitionUrl, final java.lang.String defaultMediaType) throws java.lang.Exception {
    com.smartbear.swagger.SwaggerImporter importer = com.smartbear.swagger.SwaggerUtils.importSwaggerFromUrl(project, definitionUrl, defaultMediaType);
    com.eviware.soapui.analytics.Analytics.trackAction("ImportSwagger", "Importer", importer.getClass().getSimpleName());
    return importer;
}