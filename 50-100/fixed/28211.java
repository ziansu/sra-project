public void showRulerOnImage(com.ni.vision.NIVision.Image image) {
    int rulerLineCount = ((size.height) / 2) / (org.usfirst.frc.team6179.robot.configurations.VisionConfig.rulerLineGapSize);
    for (int i = 1; i < rulerLineCount; i++) {
        int offset = i * (org.usfirst.frc.team6179.robot.configurations.VisionConfig.rulerLineGapSize);
        drawLineAboveCenter(image, offset, VisionConfig.rulerLineWidth, VisionConfig.rulerLineLength);
    }
}