@java.lang.Override
public void init() {
    telemetry.addData("OpMode", "*** AutoWheelz v1.0 ***");
    runtime.reset();
    motorR = hardwareMap.dcMotor.get("motor_r");
    motorR.setChannelMode(DcMotorController.RunMode.RESET_ENCODERS);
    motorR.setChannelMode(DcMotorController.RunMode.RUN_USING_ENCODERS);
    motorL = hardwareMap.dcMotor.get("motor_l");
    motorL.setDirection(DcMotor.Direction.REVERSE);
    motorL.setChannelMode(DcMotorController.RunMode.RESET_ENCODERS);
    motorL.setChannelMode(DcMotorController.RunMode.RUN_USING_ENCODERS);
}