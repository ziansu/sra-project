@java.lang.Override
public void init() {
    bldrive = hardwareMap.get(com.qualcomm.robotcore.hardware.DcMotor.class, "c");
    brdrive = hardwareMap.get(com.qualcomm.robotcore.hardware.DcMotor.class, "d");
    fldrive = hardwareMap.get(com.qualcomm.robotcore.hardware.DcMotor.class, "a");
    frdrive = hardwareMap.get(com.qualcomm.robotcore.hardware.DcMotor.class, "b");
    drivePowerMod = 1;
    xpower = 0;
    ypower = 0;
    lturnpower = 0;
    rturnpower = 0;
    tank = false;
    telemetry.addData("Status", "Initialized");
}