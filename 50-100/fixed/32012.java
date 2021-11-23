@java.lang.Override
public void init() {
    motorDriveLeft = hardwareMap.dcMotor.get("motorDriveLeft");
    motorDriveRight = hardwareMap.dcMotor.get("motorDriveRight");
    motorDriveRight.setDirection(DcMotor.Direction.REVERSE);
    motorDriveFront = hardwareMap.dcMotor.get("motorDriveFront");
    motorDriveBack = hardwareMap.dcMotor.get("motorDriveBack");
    motorDriveBack.setDirection(DcMotor.Direction.REVERSE);
    forceRing = hardwareMap.lightSensor.get("forceRing");
    chassis = new org.ashebots.ftcandroidlib.drive.ChassisOmni(motorDriveLeft, motorDriveRight, motorDriveFront, motorDriveBack);
}