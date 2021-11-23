public void loop() {
    float throttle = gamepad1.left_stick_y;
    motorone.setPower(throttle);
    telemetry.addData("2 Status", ("running for " + (runtime.toString())));
}