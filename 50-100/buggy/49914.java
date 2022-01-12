protected void execute() {
    if ((sensors.getUltrasonicValue()) < 60) {
        finished = true;
        driveTrain.mecanumDriveCartesian(0, 0, 0, 0);
    }else {
        driveTrain.mecanumDriveCartesian(0, (-0.3), 0, 0);
    }
}