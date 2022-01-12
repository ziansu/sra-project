@java.lang.Override
public void init() {
    bxServo = hardwareMap.servo.get("BoxServo");
    motorFL = hardwareMap.dcMotor.get("FrontLeft");
    motorFR = hardwareMap.dcMotor.get("FrontRight");
    motorRL = hardwareMap.dcMotor.get("RearLeft");
    motorRR = hardwareMap.dcMotor.get("RearRight");
    spinner = hardwareMap.dcMotor.get("FrontFlap");
    spooleo = hardwareMap.dcMotor.get("RearSpool");
    motorFL.setDirection(DcMotor.Direction.REVERSE);
    motorRR.setDirection(DcMotor.Direction.REVERSE);
    spinner.setDirection(DcMotor.Direction.REVERSE);
}