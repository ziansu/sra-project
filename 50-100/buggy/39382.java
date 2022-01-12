@java.lang.Override
public void init() {
    climbL = hardwareMap.servo.get("ClimbL");
    climbR = hardwareMap.servo.get("ClimbR");
    rotorA = hardwareMap.dcMotor.get("RotorA");
    rotorB = hardwareMap.dcMotor.get("RotorB");
    driveL = hardwareMap.dcMotor.get("DriveL");
    driveR = hardwareMap.dcMotor.get("DriveR");
    hingeA = hardwareMap.dcMotor.get("HingeA");
    hingeB = hardwareMap.dcMotor.get("HingeB");
    driveR.setDirection(DcMotor.Direction.REVERSE);
}