private void setMotors(com.qualcomm.robotcore.hardware.DcMotor motor1, com.qualcomm.robotcore.hardware.DcMotor motor2) {
    if (((motor1 != null) && ((motor1.getController()) != (this.target))) || ((motor2 != null) && ((motor2.getController()) != (this.target)))) {
        throw new java.lang.IllegalArgumentException("motors have incorrect controller for usurpation");
    }
    this.motor1 = motor1;
    this.motor2 = motor2;
}