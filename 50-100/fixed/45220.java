private int getOrientation(java.lang.String inputImage) {
    int orientation = 0;
    try {
        android.media.ExifInterface exif = new android.media.ExifInterface(inputImage);
        orientation = exif.getAttributeInt(ExifInterface.TAG_ORIENTATION, ExifInterface.ORIENTATION_UNDEFINED);
    } catch (java.io.IOException e) {
        android.util.Log.e(hu.sandorfehervari.analogdisplayreader.DisplayDetector.TAG, "Failed to red exif information from image.");
        e.printStackTrace();
    }
    return orientation;
}