@java.lang.Override
public void init() {
    motorRightPrimary = hardwareMap.dcMotor.get("motor-1");
    motorLeftPrimary = hardwareMap.dcMotor.get("motor-2");
    motorRightSecondary = hardwareMap.dcMotor.get("motor-3");
    motorLeftSecondary = hardwareMap.dcMotor.get("motor-4");
    motorLeftPrimary.setDirection(DcMotor.Direction.REVERSE);
    motorLeftSecondary.setDirection(DcMotor.Direction.REVERSE);
}