public void surfaceDestroyed(android.view.SurfaceHolder holder) {
    if ((mCamera) != null) {
        mCamera.release();
        mCamera = null;
    }
    android.util.Log.d("Sheldon", "surfaceDestroyed() is called");
}