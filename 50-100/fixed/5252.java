@java.lang.Override
public void onDrawEye(dat367.falling.Eye eye) {
    cardboardCamera.setEyeViewAdjustMatrix(new com.badlogic.gdx.math.Matrix4(eye.getEyeView()));
    float[] perspective = eye.getPerspective(dat367.falling.GdxPlatformLayer.Z_NEAR, dat367.falling.GdxPlatformLayer.Z_FAR);
    cardboardCamera.setEyeProjection(new com.badlogic.gdx.math.Matrix4(perspective));
    cardboardCamera.update();
    renderScene(cardboardCamera);
}