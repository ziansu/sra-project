@android.support.annotation.Nullable
private static java.util.List<com.otaliastudios.cameraview.Size> sizesFromList(java.util.List<android.hardware.Camera.Size> sizes) {
    if (sizes == null)
        return null;
    
    java.util.List<com.otaliastudios.cameraview.Size> result = new java.util.ArrayList(sizes.size());
    for (android.hardware.Camera.Size size : sizes) {
        result.add(new com.otaliastudios.cameraview.Size(size.width, size.height));
    }
    com.otaliastudios.cameraview.Camera1.LOG.i("sizesFromList:", result);
    return result;
}