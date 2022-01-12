public void addLocation(java.lang.String label, java.lang.Double x, java.lang.Double y) {
    org.akvo.akvoqr.calibration.CalibrationData.Location loc = new org.akvo.akvoqr.calibration.CalibrationData.Location(x, y);
    this.locations.put(label, loc);
}