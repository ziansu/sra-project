public void init(com.qualcomm.robotcore.hardware.HardwareMap aHwMap) {
    hwMap = aHwMap;
    FrontRight = hwMap.dcMotor.get("FrontRight");
    FrontLeft = hwMap.dcMotor.get("FrontLeft");
    FrontRight.setDirection(DcMotor.Direction.REVERSE);
    BackRight = hwMap.dcMotor.get("BackRight");
    BackLeft = hwMap.dcMotor.get("BackLeft");
    BackLeft.setDirection(DcMotor.Direction.REVERSE);
}