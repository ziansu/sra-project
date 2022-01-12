public void setPowers(double leftSpeed, double rightSpeed) {
    this.leftSpeed = leftSpeed;
    this.rightSpeed = rightSpeed;
    for (com.qualcomm.robotcore.hardware.DcMotor motor : leftMotorsWithEncoders) {
        motor.setPower(leftSpeed);
    }
    for (com.qualcomm.robotcore.hardware.DcMotor motor : rightMotorsWithEncoders) {
        motor.setPower(rightSpeed);
    }
    for (com.qualcomm.robotcore.hardware.DcMotor motor : leftMotors) {
        motor.setPower(leftSpeed);
    }
    for (com.qualcomm.robotcore.hardware.DcMotor motor : rightMotors) {
        motor.setPower(rightSpeed);
    }
}