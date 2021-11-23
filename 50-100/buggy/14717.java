@java.lang.SuppressWarnings(value = "unused")
private org.opencv.core.Mat warpCorners(org.opencv.core.MatOfPoint2f imageCorners) {
    org.opencv.core.Mat mat = null;
    if (warpInitialized) {
        mat = new org.opencv.core.Mat();
        org.opencv.core.Core.transform(imageCorners, mat, perspMat);
    }else {
        com.shootoff.camera.autocalibration.AutoCalibrationManager.logger.warn("warpCorners called when warpInitialized is false - {} {} - {}", perspMat, boundingBox, isCalibrated);
    }
    return mat;
}