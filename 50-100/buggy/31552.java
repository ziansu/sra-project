@java.lang.Override
public void onDestroy() {
    org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    queueEvent(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            if ((mRenderer) != null) {
                mRenderer.destroy();
            }
        }
    });
    mRenderController.destroy();
    if (!(isPreview())) {
        deactivateWallpaper();
        if ((mEngineUnlockReceiver) != null) {
            unregisterReceiver(mEngineUnlockReceiver);
        }
    }
    super.onDestroy();
}