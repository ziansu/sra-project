@java.lang.Override
public void onCreate() {
    android.util.Log.d(com.dylankpowers.timelapse.TimeLapseCaptureService.TAG, "Created");
    android.hardware.camera2.CameraManager cMan = ((android.hardware.camera2.CameraManager) (getSystemService(Context.CAMERA_SERVICE)));
    android.view.Display defaultDisplay = ((android.view.WindowManager) (getSystemService(Context.WINDOW_SERVICE))).getDefaultDisplay();
    mBackgroundThread = new android.os.HandlerThread("TimeLapseCaptureBackground");
    mBackgroundThread.start();
    android.os.Handler backgroundHandler = new android.os.Handler(mBackgroundThread.getLooper());
    mCapture = new com.dylankpowers.timelapse.TimeLapseCapture(cMan, backgroundHandler, defaultDisplay, getContentResolver(), this);
}