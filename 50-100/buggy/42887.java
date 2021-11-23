public void init() {
    motorRight = hardwareMap.dcMotor.get("motor_2");
    motorLeft = hardwareMap.dcMotor.get("motor_1");
    motorRight2 = hardwareMap.dcMotor.get("motor_3");
    motorLeft2 = hardwareMap.dcMotor.get("motor_4");
    motorRight3 = hardwareMap.dcMotor.get("motor_5");
    motorLeft3 = hardwareMap.dcMotor.get("motor_6");
    motorRight3.setDirection(DcMotor.Direction.REVERSE);
    motorLeft3.setDirection(DcMotor.Direction.REVERSE);
}