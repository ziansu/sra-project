@java.lang.Override
public void onDestroy() {
    org.greenrobot.eventbus.EventBus.getDefault().unregister(this);
    deactivateWallpaper();
    queueEvent(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            if ((mRenderer) != null) {
                mRenderer.destroy();
            }
        }
    });
    mRenderController.destroy();
    super.onDestroy();
}