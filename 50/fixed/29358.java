public java.util.List<android.hardware.Camera.Size> getSupportedPictureSizes(android.hardware.Camera.Parameters parameters) {
    java.util.List<android.hardware.Camera.Size> pictureSizes = parameters.getSupportedPictureSizes();
    pictureSizes = checkSupportedPictureSizeAtPreviewSize(pictureSizes, parameters);
    return pictureSizes;
}