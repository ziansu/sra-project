public void setSpeed(double speed) {
    if (((armsPot.get()) < (Constants.Arms.ARMS_MAX_DEGREES)) && (!((org.usfirst.frc.team5687.robot.utils.Helpers.applySensitivityTransform(speed)) < 0))) {
        armsMotor.set(org.usfirst.frc.team5687.robot.utils.Helpers.applySensitivityTransform(speed));
    }else {
        armsMotor.set(0);
    }
}