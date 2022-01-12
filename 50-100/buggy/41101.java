public void turnOff(final org.gearvrf.GVRScene... scene) {
    mInverted = false;
    mGvrContext.runOnGlThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            for (org.gearvrf.GVRScene gvrScene : scene) {
                gvrScene.getMainCameraRig().getLeftCamera().removePostEffect(postEffect);
                gvrScene.getMainCameraRig().getRightCamera().removePostEffect(postEffect);
            }
        }
    });
}