@java.lang.Override
public void init() {
    gamepad1.setJoystickDeadzone(0.1F);
    gamepad2.setJoystickDeadzone(0.1F);
    frontLeft = hardwareMap.dcMotor.get("frontLeft");
    frontRight = hardwareMap.dcMotor.get("frontRight");
    backLeft = hardwareMap.dcMotor.get("backLeft");
    backRight = hardwareMap.dcMotor.get("backRight");
    one = new com.lasarobotics.library.controller.Controller(gamepad1);
    two = new com.lasarobotics.library.controller.Controller(gamepad2);
    reader = new com.lasarobotics.library.monkeyc.MonkeyDo("test.txt", com.qualcomm.ftcrobotcontroller.MyApplication.getAppContext());
}