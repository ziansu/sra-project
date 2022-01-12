@java.lang.Override
public void init() {
    motorDriveLeft = hardwareMap.dcMotor.get("motorDriveLeft");
    motorDriveLeft.setDirection(DcMotor.Direction.REVERSE);
    motorDriveRight = hardwareMap.dcMotor.get("motorDriveRight");
    motorLinearSlideLift = hardwareMap.dcMotor.get("motorLinearSlideLift");
    touchRingFront = hardwareMap.touchSensor.get("touchRingFront");
    touchRingBack = hardwareMap.touchSensor.get("touchRingBack");
    chassis = new org.ashebots.ftcandroidlib.drive.ChassisArcade(motorDriveLeft, motorDriveRight);
}