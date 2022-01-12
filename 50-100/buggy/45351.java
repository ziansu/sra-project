@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    android.opengl.GLSurfaceView view = new android.opengl.GLSurfaceView(this);
    view.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
    view.setRenderer(new com.example.user.solarsystem.SolarSystemRenderer());
    setContentView(view);
}