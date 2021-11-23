@java.lang.Override
public java.net.URL getResource(java.lang.String path) throws java.net.MalformedURLException {
    java.lang.String validatedPath = validateResourcePath(path, false);
    if (validatedPath == null) {
        throw new java.net.MalformedURLException(org.apache.catalina.core.ApplicationContext.sm.getString("applicationContext.requestDispatcher.iae", path));
    }
    org.apache.catalina.WebResourceRoot resources = context.getResources();
    if (resources != null) {
        return resources.getResource(validatedPath).getURL();
    }
    return null;
}