@java.lang.Override
public void onSurfaceCreated(javax.microedition.khronos.opengles.GL10 gl, javax.microedition.khronos.egl.EGLConfig config) {
    android.opengl.GLES20.glClearColor(0.5F, 0.5F, 0.5F, 1.0F);
    mBoard = new org.no_ip.chrisbregg.simon.GameBoard();
    mPattern = new java.util.ArrayList<java.lang.Integer>();
    mRand = new java.util.Random();
}