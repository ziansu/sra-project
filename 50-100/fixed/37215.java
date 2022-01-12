public void debug() {
    telemetry.addData("CASE_NUMBER", value);
    telemetry.addData("HEADING", gyro.getHeading());
    telemetry.addData("INT_Z", gyro.getIntegratedZValue());
    telemetry.addData("CHECK_LINE_COLOR", lineColor.red());
    telemetry.addData("CHECK_RED_COLOR", beaconColor.red());
    telemetry.addData("CHECK_BLUE_COLOR", beaconColor.blue());
    telemetry.update();
}