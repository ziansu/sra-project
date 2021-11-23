@java.lang.SuppressWarnings(value = "unused")
private org.opencv.core.Mat warpCorners(org.opencv.core.MatOfPoint2f imageCorners) {
    final org.opencv.core.Mat mat;
    if (warpInitialized) {
        mat = new org.opencv.core.Mat();
        org.opencv.core.Core.transform(imageCorners, mat, perspMat);
    }else {
        mat = null;
        com.shootoff.camera.autocalibration.AutoCalibrationManager.logger.warn("warpCorners called when warpInitialized is false - {} {} - {}", perspMat, boundingBox, isCalibrated);
    }
    return mat;
}