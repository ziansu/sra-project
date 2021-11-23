private void initRotationDelta(final net.gini.android.vision.internal.camera.photo.ExifReader exifReader, final java.lang.String userComment) {
    java.lang.String rotationDelta = exifReader.getValueForKeyFromUserComment(Exif.USER_COMMENT_ROTATION_DELTA, userComment);
    if (rotationDelta != null) {
        try {
            mRotationDelta = java.lang.Integer.parseInt(rotationDelta);
        } catch (java.lang.NumberFormatException e) {
            net.gini.android.vision.internal.camera.photo.MutablePhoto.LOG.error("Could not set rotation delta from exif User Comment", e);
        }
    }
}