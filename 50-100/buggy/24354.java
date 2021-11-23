@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.mayi.jni_l3.JNILib.init(getAssets());
    com.mayi.jni_l3.JNILib.readAsset();
    android.opengl.GLSurfaceView surfaceView = new android.opengl.GLSurfaceView(this);
    surfaceView.setEGLContextClientVersion(2);
    surfaceView.setRenderer(new com.mayi.jni_l3.GLRenderer());
    surfaceView.setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);
    setContentView(surfaceView);
}