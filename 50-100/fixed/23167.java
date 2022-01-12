private void loadAttributes() throws java.io.IOException {
    for (int i = 0; i < (android.media.ExifInterface.EXIF_TAGS.length); ++i) {
        mAttributes[i] = new java.util.HashMap();
    }
    try {
        java.io.InputStream in = new java.io.FileInputStream(mFilename);
        getJpegAttributes(in);
    } catch (java.io.IOException e) {
        android.util.Log.w(android.media.ExifInterface.TAG, "Invalid image.", e);
    } finally {
        addDefaultValuesForCompatibility();
        if (android.media.ExifInterface.DEBUG) {
            printAttributes();
        }
    }
}