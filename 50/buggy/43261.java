void shutdown() {
    android.os.Looper.myLooper().quit();
    synchronized(renderObj) {
        isReady = true;
        renderObj.notify();
    }
    android.util.Log.d(com.flipcam.view.CameraView.TAG, "Camera thread done... main thread can continue");
}