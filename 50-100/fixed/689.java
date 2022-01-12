@java.lang.Override
public void onCreate() {
    super.onCreate();
    com.byteshaft.neon.FlashlightService.setServiceInstance(this);
    mScreenStateListener = new com.byteshaft.neon.ScreenStateListener(this);
    mRemoteUi = new com.byteshaft.neon.RemoteUpdateUiHelpers(this);
    mSystemManager = new com.byteshaft.neon.SystemManager(this);
    mNotification = new com.byteshaft.neon.Notification(this);
    mFlashlight = new com.byteshaft.ezflashlight.Flashlight(this);
}