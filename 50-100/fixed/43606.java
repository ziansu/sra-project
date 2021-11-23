public void gyroHold(double speed, double angle, double holdTime) {
    holdTimer.reset();
    while ((opModeIsActive()) && ((holdTimer.time()) < holdTime)) {
        onHeading(speed, angle, org.firstinspires.ftc.ftc12069.Autonomous.P_TURN_COEFF);
        telemetry.update();
    } 
    robot.LBMotor.setPower(0);
    robot.RBMotor.setPower(0);
}