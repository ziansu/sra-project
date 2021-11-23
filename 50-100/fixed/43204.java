public java.lang.String getMediaInfo(java.io.File file, java.lang.String format) throws java.lang.Exception {
    net.filebot.format.ExpressionFormat formatter = new net.filebot.format.ExpressionFormat(format);
    java.lang.Object o = xattr.getMetaInfo(file);
    java.io.File f = file.getCanonicalFile();
    try {
        return formatter.format(new net.filebot.format.MediaBindingBean(o, f));
    } catch (java.lang.Exception e) {
        debug.warning(("Failed to read media info: " + e));
    }
    return null;
}