@java.lang.Override
public void init() {
    telemetry.addData("OpMode", "*** AutoWheelz v1.0 ***");
    runtime.reset();
    com.qualcomm.ftcrobotcontroller.opmodes.OpState.SetCurrentState("Forward");
    motorR = hardwareMap.dcMotor.get("motor_r");
    motorR.setDirection(DcMotor.Direction.REVERSE);
    motorR.setChannelMode(DcMotorController.RunMode.RESET_ENCODERS);
    motorR.setChannelMode(DcMotorController.RunMode.RUN_USING_ENCODERS);
    motorL = hardwareMap.dcMotor.get("motor_l");
    motorL.setChannelMode(DcMotorController.RunMode.RESET_ENCODERS);
    motorL.setChannelMode(DcMotorController.RunMode.RUN_USING_ENCODERS);
}