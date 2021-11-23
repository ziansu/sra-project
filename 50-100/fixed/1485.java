@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    javaCameraView = ((org.opencv.android.JavaCameraView) (findViewById(R.id.java_camera_view)));
    javaCameraView.setVisibility(SurfaceView.VISIBLE);
    javaCameraView.setCvCameraViewListener(this);
    com.example.idan.urban_octo_guacamole.inputHandler ih = new com.example.idan.urban_octo_guacamole.inputHandler(this);
    ih.getImg();
}