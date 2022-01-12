public void setRightDriveTrain(double speed) {
    if ((java.lang.Math.abs(speed)) > 1.0) {
        throw new java.lang.IllegalArgumentException("speed must be between -1 and 1");
    }
    FRONT_RIGHT_MOTOR.set((-speed));
    REAR_RIGHT_MOTOR.set((-speed));
}