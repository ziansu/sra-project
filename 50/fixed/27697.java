@java.lang.Override
public java.io.File locateFile(java.lang.String relativePath) {
    java.io.File file = new java.io.File(de.deepamehta.plugins.proxy.ProxyPlugin.FILE_REPOSITORY_PATH, relativePath);
    checkFileAccess(file);
    return file;
}