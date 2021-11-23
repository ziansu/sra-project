public java.lang.String getLocalTempDir() {
    java.lang.String path = properties.getString("temp-folder", "WEB-INF/tmp");
    if (path != null) {
        path = replaceFolderVariable(path);
    }
    return path;
}