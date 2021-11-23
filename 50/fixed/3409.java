public void resetDriveEncoder(com.qualcomm.robotcore.hardware.DcMotor motorType) {
    if (motorType != null) {
        com.qualcomm.robotcore.hardware.DcMotor.RunMode runMode = this.wheelController.getMotorMode(motorType.getPortNumber());
        motorType.setMode(runMode.RESET_ENCODERS);
    }
}