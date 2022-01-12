private synchronized void startPreview(final int width, final int height) {
    if ((mCameraHandler) == null) {
        final com.serenegiant.audiovideosample.CameraGLView.CameraThread thread = new com.serenegiant.audiovideosample.CameraGLView.CameraThread(this);
        thread.start();
        mCameraHandler = thread.getHandler();
    }
    mCameraHandler.startPreview(width, height);
}