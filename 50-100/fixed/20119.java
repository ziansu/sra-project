protected void logTelemetry() {
    telemetry.addData("Light Sensor", lightSensor.toString());
    telemetry.addData("Gyro Heading", java.lang.String.format("%03d", gyroSensor.getHeading()));
    telemetry.addData("left motor", motorLeft.getCurrentPosition());
    telemetry.addData("right motor", motorRight.getCurrentPosition());
    telemetry.addData("RunMode: ", motorLeft.getMode().toString());
}