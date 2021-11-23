private void updateTelemetryData() {
    telemetry.addData(TAG, "Status : RUNNING");
    telemetry.addData(TAG, ("Left Ultrasonic Detected : " + (robot.ultrasonicSensorLeft.getUltrasonicLevel())));
    telemetry.addData(TAG, ("Right Ultrasonic Detected : " + (robot.ultrasonicSensorRight.getUltrasonicLevel())));
    telemetry.update();
}