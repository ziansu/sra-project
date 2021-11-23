public java.util.Map<java.lang.String, com.wordnik.swagger.models.auth.SecuritySchemeDefinition> toSecuritySchemeDefinitions(springfox.documentation.service.ResourceListing from) {
    return com.google.common.collect.Maps.transformValues(com.google.common.collect.Maps.uniqueIndex(from.getAuthorizations(), schemeName()), toSecuritySchemeDefinition());
}