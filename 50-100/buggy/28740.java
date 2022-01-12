protected void configureCamera() {
    edu.wpi.first.wpilibj.CameraServer server = edu.wpi.first.wpilibj.CameraServer.getInstance();
    org.usfirst.frc2175.config.VisionProcessingConfig visionProcessingConfig = robotConfig.getVisionProcessingConfig();
    int webCamQuality = visionProcessingConfig.getWebCamQuality();
    java.lang.String webCamName = visionProcessingConfig.getWebCamName();
    server.setQuality(webCamQuality);
    server.startAutomaticCapture(webCamName);
    org.usfirst.frc2175.config.WiringConfig wiringConfig = robotConfig.getWiringConfig();
    imageHandler = new org.usfirst.frc2175.driverstation.ImageHandler(wiringConfig);
}