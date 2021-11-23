@java.lang.Override
protected void initialize() {
    move.start();
    initialAngle = imu.getYaw();
    try {
        motionController.resetSafely();
    } catch (org.usfirst.frc4904.standard.custom.sensors.InvalidSensorException e) {
        move.cancel();
        cancel();
        if ((fallbackCommand) != null) {
            fallbackCommand.start();
        }
        return ;
    }
}