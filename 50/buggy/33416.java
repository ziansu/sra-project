@java.lang.Override
public void onDrawFrame(javax.microedition.khronos.opengles.GL10 gl) {
    android.opengl.GLES20.glClear(((android.opengl.GLES20.GL_COLOR_BUFFER_BIT) | (android.opengl.GLES20.GL_DEPTH_BUFFER_BIT)));
    mFilter.onDrawFrame(gl);
}