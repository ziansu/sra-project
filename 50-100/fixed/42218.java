@java.lang.Override
public void loop() {
    float backwardsForwards;
    float leftRight;
    float strafeSpeed = 0;
    strafeSpeed = gamepad1.left_stick_x;
    backwardsForwards = gamepad1.right_stick_y;
    leftRight = (gamepad1.right_stick_x) / 2;
    if (gamepad1.left_bumper) {
        ballMotor.setPower(1);
    }else {
        ballMotor.setPower(0);
    }
    strafeMotor.setPower((-strafeSpeed));
    leftDriveMotor.setPower((backwardsForwards + leftRight));
    rightDriveMotor.setPower((backwardsForwards - leftRight));
}