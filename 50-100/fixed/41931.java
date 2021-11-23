private java.net.URL getScriptResource() {
    java.lang.String resourceName = "/META-INF/resources/webjars/" + (getOutputScriptName());
    java.net.URL url = org.zanata.util.CommonMarkRenderer.class.getResource(resourceName);
    if (url == null) {
        throw new java.lang.IllegalArgumentException((((("resource " + resourceName) + " relative to ") + (org.zanata.util.CommonMarkRenderer.class.getName())) + " not found."));
    }
    return url;
}