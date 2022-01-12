private int getOrientation(java.lang.String inputImage) {
    android.media.ExifInterface exif = null;
    try {
        exif = new android.media.ExifInterface(inputImage);
    } catch (java.io.IOException e) {
        android.util.Log.e(hu.sandorfehervari.analogdisplayreader.DisplayDetector.TAG, "Failed to red exif information from image.");
        e.printStackTrace();
    }
    int orientation = exif.getAttributeInt(ExifInterface.TAG_ORIENTATION, ExifInterface.ORIENTATION_UNDEFINED);
    return orientation;
}