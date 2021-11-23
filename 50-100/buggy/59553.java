private void updateTelemetryData() {
    telemetry.addData(TAG, "Status : RUNNING");
    telemetry.addData(TAG, ("Left Ultrasonic Detected : " + (robotUtilities.getUltrasonicLevel(robot.ultrasonicSensorLeft))));
    telemetry.addData(TAG, ("Right Ultrasonic Detected : " + (robotUtilities.getUltrasonicLevel(robot.ultrasonicSensorRight))));
    telemetry.update();
}