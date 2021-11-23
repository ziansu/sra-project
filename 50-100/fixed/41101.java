public void turnOff(final org.gearvrf.GVRScene... scene) {
    mInverted = false;
    for (org.gearvrf.GVRScene gvrScene : scene) {
        gvrScene.getMainCameraRig().getLeftCamera().removePostEffect(postEffect);
        gvrScene.getMainCameraRig().getRightCamera().removePostEffect(postEffect);
    }
}