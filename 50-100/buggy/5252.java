@java.lang.Override
public void onDrawEye(dat367.falling.Eye eye) {
    Gdx.gl.glEnable(GL20.GL_DEPTH_TEST);
    Gdx.gl.glClear(((com.badlogic.gdx.graphics.GL20.GL_COLOR_BUFFER_BIT) | (com.badlogic.gdx.graphics.GL20.GL_DEPTH_BUFFER_BIT)));
    cardboardCamera.setEyeViewAdjustMatrix(new com.badlogic.gdx.math.Matrix4(eye.getEyeView()));
    float[] perspective = eye.getPerspective(dat367.falling.GdxPlatformLayer.Z_NEAR, dat367.falling.GdxPlatformLayer.Z_FAR);
    cardboardCamera.setEyeProjection(new com.badlogic.gdx.math.Matrix4(perspective));
    cardboardCamera.update();
    renderScene(cardboardCamera);
    dat367.falling.RenderQueue.reloadQueue();
}