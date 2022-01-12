@java.lang.Override
public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 unused, int width, int height) {
    android.opengl.GLES20.glViewport(0, 0, width, height);
    float ratio = ((float) (width)) / height;
    android.opengl.Matrix.frustumM(mProjectionMatrix, 0, (-ratio), ratio, (-1), 1, 3, 7);
}