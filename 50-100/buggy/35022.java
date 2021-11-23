@org.junit.Test
public void testCalibrateTightPatternUpsidedown() throws java.io.IOException {
    acm.reset();
    java.awt.image.BufferedImage testFrame = javax.imageio.ImageIO.read(com.shootoff.camera.TestAutoCalibration.class.getResourceAsStream("/autocalibration/tight-calibration-pattern-upsidedown.png"));
    final org.opencv.core.Mat mat = new org.opencv.core.Mat();
    acm.preProcessFrame(testFrame, mat);
    final java.util.Optional<org.opencv.core.MatOfPoint2f> boardCorners = acm.findChessboard(mat);
    assertTrue(boardCorners.isPresent());
    java.util.Optional<javafx.geometry.Bounds> calibrationBounds = acm.calibrateFrame(boardCorners.get(), mat);
    assertFalse(calibrationBounds.isPresent());
}