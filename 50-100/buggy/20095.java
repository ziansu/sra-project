public void turnOn(final org.gearvrf.GVRScene... scene) {
    mInverted = true;
    mGvrContext.runOnGlThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            for (org.gearvrf.GVRScene gvrScene : scene) {
                gvrScene.getMainCameraRig().getLeftCamera().addPostEffect(postEffect);
                gvrScene.getMainCameraRig().getRightCamera().addPostEffect(postEffect);
            }
        }
    });
}