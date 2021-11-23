private void updateReverseDrive() {
    if (sigRightTrigger.risingEdge(((gamepad1.right_trigger) > 0.5)))
        backwardsDrive = !(backwardsDrive);
    
    if ((backwardsDrive) == true) {
        org.firstinspires.ftc.teamcode.Utilities.ManualControl.setSingleStickXY((-(gamepad1.left_stick_x)), (-(gamepad1.left_stick_y)));
    }else {
        org.firstinspires.ftc.teamcode.Utilities.ManualControl.setSingleStickXY(gamepad1.left_stick_x, gamepad1.left_stick_y);
    }
}