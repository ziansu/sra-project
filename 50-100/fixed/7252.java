static java.io.File constructFile(java.lang.String basePath, java.lang.String fileName) {
    java.io.File file;
    java.io.File absolute = new java.io.File(fileName);
    if ((org.apache.commons.lang3.StringUtils.isEmpty(basePath)) || (absolute.isAbsolute())) {
        file = absolute;
    }else {
        file = new java.io.File(org.apache.commons.configuration2.io.FileLocatorUtils.appendPath(basePath, fileName));
    }
    return file;
}