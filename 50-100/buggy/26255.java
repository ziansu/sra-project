private void addCalColours(org.opencv.core.Mat imgMat, org.akvo.akvoqr.calibration.CalibrationData calData) {
    for (int no : calData.locations.keySet()) {
        org.akvo.akvoqr.calibration.CalibrationData.Location loc = calData.locations.get(no);
        addPatch(imgMat, loc.x, loc.y, calData.calValues.get(no), calData);
    }
}