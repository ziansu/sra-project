@java.lang.Override
public void init() {
    robot.initTeleOp(hardwareMap);
    gamepad1.setJoystickDeadzone(0.1F);
    gamepad2.setJoystickDeadzone(0.1F);
}