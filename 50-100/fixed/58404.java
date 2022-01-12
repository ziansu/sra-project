@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    cameraBridgeViewBase = ((org.opencv.android.CameraBridgeViewBase) (findViewById(R.id.mainactivity_surface_view)));
    cameraBridgeViewBase.setCameraIndex(0);
    cameraBridgeViewBase.setVisibility(CameraBridgeViewBase.VISIBLE);
    cameraBridgeViewBase.setCvCameraViewListener(this);
    cameraBridgeViewBase.setCameraIndex(cameraBridgeViewBase.CAMERA_ID_BACK);
}