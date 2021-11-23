@java.lang.Override
protected void initializeRenderer(android.app.Activity activity, java.lang.Object... extra) {
    mRenderer = new com.adrian.mythic.MythicRender(activity);
    mCameraContainer.initialize(new mythic.adrian.imageprocessor.camera.view.CameraView.OnGLDestroyedListener() {
        @java.lang.Override
        public void onDestroyed(android.view.SurfaceHolder holder) {
            if (null != (mRenderer)) {
                mRenderer.onSurfaceDestroyed();
            }
        }
    });
    mImageCallBack = new mythic.adrian.imageprocessor.camera.CameraInterface.ImageCallBack() {
        @java.lang.Override
        public void onHandle(byte[] data, int w, int h, int format) {
        }

        @java.lang.Override
        public void onError(java.lang.String msg) {
        }
    };
}