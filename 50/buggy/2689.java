public void start() {
    robot.shooter.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
    lastTime = timestamp;
    lstTicks = crntTicks;
}