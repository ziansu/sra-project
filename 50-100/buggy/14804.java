private java.lang.String getProxyFilePath(java.lang.String fileName, mamFiles.MAMFile mamFile) {
    java.lang.String path = getAbsPathForProxies(Toolbox.FileHelpers.getFileNameNoExtension(fileName));
    java.lang.String proxyExt = Toolbox.FileHelpers.getFileExtension(mamFile.suggestProxyFileName());
    java.lang.String proxyFileName = (fileName + ".") + proxyExt;
    return Toolbox.FileHelpers.join(path, proxyFileName);
}