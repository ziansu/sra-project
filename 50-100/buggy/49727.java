@java.lang.Override
public void onDrawEye(com.google.vr.sdk.base.Eye eye) {
    android.opengl.GLES20.glEnable(GLES20.GL_DEPTH_TEST);
    android.opengl.GLES20.glClear(((android.opengl.GLES20.GL_COLOR_BUFFER_BIT) | (android.opengl.GLES20.GL_DEPTH_BUFFER_BIT)));
    com.google.vr.sdk.samples.treasurehunt.GLErrorUtils.checkGLError("colorParam");
    reusedEyeData.updateFromEye(eye, reusedHeadData);
    for (com.google.vr.sdk.samples.treasurehunt.VisibleGvrObject visibleGvrObject : visibleGvrObjects) {
        visibleGvrObject.draw(reusedEyeData);
    }
}