@java.lang.Override
public void init() {
    camera = new com.acmerobotics.relicrecovery.vision.VisionCamera(hardwareMap.appContext);
    cryptoboxTracker = new com.acmerobotics.relicrecovery.vision.CryptoboxTracker(true);
    fpsTracker = new com.acmerobotics.relicrecovery.vision.FpsTracker();
    camera.addTracker(cryptoboxTracker);
    camera.addTracker(fpsTracker);
    camera.setImageDir(com.acmerobotics.relicrecovery.vision.VisionUtil.getImageDir(this));
    camera.initialize(VisionConstants.VUFORIA_PARAMETERS);
}