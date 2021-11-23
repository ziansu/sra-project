private void startMotors() {
    double motor_power = power;
    if (!(isPositive)) {
        motor_power = -(power);
    }
    org.firstinspires.ftc.teamcode.MotorFrontLeft.setPower(motor_power);
    org.firstinspires.ftc.teamcode.MotorFrontRight.setPower(motor_power);
    org.firstinspires.ftc.teamcode.MotorBackLeft.setPower(motor_power);
    org.firstinspires.ftc.teamcode.MotorBackRight.setPower(motor_power);
}