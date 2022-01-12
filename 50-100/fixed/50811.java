@java.lang.Override
public void loop() {
    double leftY = (-(gamepad1.left_stick_y)) * 100;
    double rightY = (-(gamepad1.right_stick_y)) * 100;
    leftMotor.setPower((leftY / 200));
    midLeftMotor.setPower((leftY / 200));
    rightMotor.setPower((leftY / 200));
    midRightMotor.setPower((leftY / 200));
}