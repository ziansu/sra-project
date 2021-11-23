@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    super.onStartCommand(intent, flags, startId);
    try {
        cameraId = intent.getIntExtra(Constants.CAMERA_ID, com.viewnine.nuttysnap.service.BackgroundVideoRecorder.BACK_CAMERA_ID);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        cameraId = com.viewnine.nuttysnap.activity.LockScreenAppActivity.cameraId;
    }
    initSurface();
    return START_STICKY;
}