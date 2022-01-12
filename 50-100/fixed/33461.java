@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.shc.silenceengine.backend.android.AndroidLauncher.instance = this;
    requestWindowFeature(Window.FEATURE_NO_TITLE);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    surfaceView = new android.opengl.GLSurfaceView(this);
    surfaceView.setEGLContextClientVersion(3);
    surfaceView.setPreserveEGLContextOnPause(true);
    surfaceView.setRenderer((renderer = new com.shc.silenceengine.backend.android.AndroidWindow(this::launchGame)));
    setContentView(surfaceView);
}