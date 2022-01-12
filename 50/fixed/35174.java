public static com.mfhyy.murphy.runtimepermission.camera.CameraPreviewFragment getInstance() {
    if ((com.mfhyy.murphy.runtimepermission.camera.CameraPreviewFragment.mInstance) == null) {
        java.lang.Class clazz = com.mfhyy.murphy.runtimepermission.camera.CameraPreviewFragment.class;
        synchronized(clazz) {
            com.mfhyy.murphy.runtimepermission.camera.CameraPreviewFragment.mInstance = new com.mfhyy.murphy.runtimepermission.camera.CameraPreviewFragment();
        }
    }
    return com.mfhyy.murphy.runtimepermission.camera.CameraPreviewFragment.mInstance;
}