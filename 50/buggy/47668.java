public void addLocation(java.lang.Integer i, java.lang.Double x, java.lang.Double y, java.lang.Boolean grayPatch) {
    org.akvo.akvoqr.calibration.CalibrationData.Location loc = new org.akvo.akvoqr.calibration.CalibrationData.Location(x, y, grayPatch);
    this.locations.put(i, loc);
}