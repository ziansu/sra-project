@java.lang.Override
public void init() {
    l = hardwareMap.dcMotor.get("left");
    r = hardwareMap.dcMotor.get("right");
    l.setDirection(DcMotor.Direction.REVERSE);
    telearm = hardwareMap.dcMotor.get("arm");
    lim = hardwareMap.touchSensor.get("lim");
    extend = hardwareMap.dcMotor.get("extend");
    extend.setMode(DcMotorController.RunMode.RUN_TO_POSITION);
}