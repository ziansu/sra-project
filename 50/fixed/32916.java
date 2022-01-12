public void run() {
    if ((null != (mMediaServer)) && (mMediaServer.isRunning())) {
        mMediaServer.stop();
        mMediaServer = null;
        android.util.Log.i(com.meizu.ruandongchuan.dlnatest.service.DLNAService.TAG, "stopMediaServer");
    }
}