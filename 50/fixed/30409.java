@java.lang.Override
public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 gl, int width, int height) {
    super.onSurfaceChanged(gl, width, height);
    mRender.onSurfaceChanged(gl, width, height);
    android.opengl.GLES20.glViewport(0, 0, width, height);
}