public static java.lang.String getResourceName(java.lang.String resource, boolean singularize) {
    if (org.springframework.util.StringUtils.hasText(resource)) {
        java.lang.String resourceName = org.springframework.util.StringUtils.capitalize(resource);
        if (singularize) {
            resourceName = org.raml.parser.utils.Inflector.singularize(resourceName);
        }
        resourceName = com.phoenixnap.oss.ramlapisync.naming.NamingHelper.cleanNameForJava(resourceName);
        return resourceName;
    }
    return null;
}