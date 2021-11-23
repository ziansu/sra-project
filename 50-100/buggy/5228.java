@java.lang.Override
public java.io.InputStream getResourceAsStream(java.lang.String path) {
    java.lang.String validatedPath = validateResourcePath(path);
    if (validatedPath == null) {
        return null;
    }
    org.apache.catalina.WebResourceRoot resources = context.getResources();
    if (resources != null) {
        return resources.getResource(validatedPath).getInputStream();
    }
    return null;
}