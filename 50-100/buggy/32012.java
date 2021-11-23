@java.lang.Override
public void init() {
    motorDriveLeft = hardwareMap.dcMotor.get("motorDriveLeft");
    motorDriveLeft.setDirection(DcMotor.Direction.REVERSE);
    motorDriveRight = hardwareMap.dcMotor.get("motorDriveRight");
    motorDriveFront = hardwareMap.dcMotor.get("motorDriveFront");
    motorDriveFront.setDirection(DcMotor.Direction.REVERSE);
    motorDriveBack = hardwareMap.dcMotor.get("motorDriveBack");
    forceRing = hardwareMap.lightSensor.get("forceRing");
    chassis = new org.ashebots.ftcandroidlib.drive.ChassisOmni(motorDriveLeft, motorDriveRight, motorDriveFront, motorDriveBack);
}