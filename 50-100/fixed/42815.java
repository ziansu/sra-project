public void setSpeed(double speed) {
    if (((armsPot.get()) > (Constants.Arms.ARMS_MAX_DEGREES)) && ((org.usfirst.frc.team5687.robot.utils.Helpers.applySensitivityTransform(speed)) < 0)) {
        armsMotor.set(0);
    }else {
        armsMotor.set(org.usfirst.frc.team5687.robot.utils.Helpers.applySensitivityTransform(speed));
    }
}