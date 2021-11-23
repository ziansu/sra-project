public void turnOn(final org.gearvrf.GVRScene... scene) {
    mInverted = true;
    for (org.gearvrf.GVRScene gvrScene : scene) {
        gvrScene.getMainCameraRig().getLeftCamera().addPostEffect(postEffect);
        gvrScene.getMainCameraRig().getRightCamera().addPostEffect(postEffect);
    }
}