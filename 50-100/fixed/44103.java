@java.lang.Override
public void init() {
    gamepad1.setJoystickDeadzone(0.1F);
    gamepad2.setJoystickDeadzone(0.1F);
    one = new com.lasarobotics.library.controller.Controller(gamepad1);
    two = new com.lasarobotics.library.controller.Controller(gamepad2);
    reader = new com.lasarobotics.library.monkeyc.MonkeyDo("test.txt", com.qualcomm.ftcrobotcontroller.MyApplication.getAppContext());
}