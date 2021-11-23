@java.lang.Override
public void init() {
    motorDriveLeft = hardwareMap.dcMotor.get("motorDriveLeft");
    motorDriveRight = hardwareMap.dcMotor.get("motorDriveRight");
    motorDriveRight.setDirection(DcMotor.Direction.REVERSE);
    motorLinearSlideLift = hardwareMap.dcMotor.get("motorLinearSlideLift");
    touchRingFront = hardwareMap.touchSensor.get("touchRingFront");
    touchRingBack = hardwareMap.touchSensor.get("touchRingBack");
    chassis = new org.ashebots.ftcandroidlib.drive.ChassisArcade(motorDriveLeft, motorDriveRight);
}