@java.lang.Override
public void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 glUnused, int width, int height) {
    android.opengl.GLES20.glViewport(0, 0, width, height);
    com.example.akiwiksten.quaki.util.MatrixHelper.perspectiveM(projectionMatrix, 45, (((float) (width)) / ((float) (height))), 0.0F, 100.0F);
    android.opengl.Matrix.setLookAtM(viewMatrix, 0, (-10.0F), 5.0F, 10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F);
}