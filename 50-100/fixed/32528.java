private void initRotationDelta(final java.lang.String userComment) {
    java.lang.String rotationDelta = net.gini.android.vision.internal.camera.photo.ExifReader.getValueForKeyFromUserComment(Exif.USER_COMMENT_ROTATION_DELTA, userComment);
    if (rotationDelta != null) {
        try {
            mRotationDelta = java.lang.Integer.parseInt(rotationDelta);
        } catch (java.lang.NumberFormatException e) {
            net.gini.android.vision.internal.camera.photo.MutablePhoto.LOG.error("Could not set rotation delta from exif User Comment", e);
        }
    }
}