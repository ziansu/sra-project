static java.io.File constructFile(java.lang.String basePath, java.lang.String fileName) {
    java.io.File file;
    java.io.File absolute = null;
    if (fileName != null) {
        absolute = new java.io.File(fileName);
    }
    if ((org.apache.commons.lang3.StringUtils.isEmpty(basePath)) || ((absolute != null) && (absolute.isAbsolute()))) {
        file = new java.io.File(fileName);
    }else {
        file = new java.io.File(org.apache.commons.configuration2.io.FileLocatorUtils.appendPath(basePath, fileName));
    }
    return file;
}