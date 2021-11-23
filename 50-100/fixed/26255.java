private void addCalColours(org.opencv.core.Mat imgMat, org.akvo.akvoqr.calibration.CalibrationData calData) {
    for (java.lang.String label : calData.locations.keySet()) {
        org.akvo.akvoqr.calibration.CalibrationData.Location loc = calData.locations.get(label);
        addPatch(imgMat, loc.x, loc.y, calData.calValues.get(label), calData);
    }
}