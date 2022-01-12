@handy.tools.annotations.MethodArgs
public static java.lang.String resolveAbsolutePath(java.lang.String relativePath) {
    java.lang.String path = null;
    try {
        path = handy.tools.helpers.PathHelper.class.getClassLoader().getResource(relativePath).getPath();
    } catch (java.lang.Exception e) {
        path = GetAbsoluteFilePath(relativePath);
    }
    return path;
}