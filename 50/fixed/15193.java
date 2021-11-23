private java.lang.String getKey(java.io.File image) {
    return (getClass().getCanonicalName()) + (image.getAbsolutePath());
}