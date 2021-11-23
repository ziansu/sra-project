@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    mRemoteUi.setUiButtonsOn(false);
    if (com.byteshaft.ezflashlight.FlashlightGlobals.isFlashlightOn()) {
        stopTorch();
    }
    mScreenStateListener.unregister();
    mSystemManager.releaseWakeLock();
    mFlashlight.releaseAllResources();
    com.byteshaft.neon.FlashlightService.setServiceInstance(null);
    android.util.Log.i(AppGlobals.LOG_TAG, "Service down.");
}