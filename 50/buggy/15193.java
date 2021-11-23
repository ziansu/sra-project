private java.lang.String getKey(com.filmon.maven.Image image) {
    return (getClass().getCanonicalName()) + (image.getSource().getAbsolutePath());
}