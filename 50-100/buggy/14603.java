@java.lang.Override
public void init() {
    motorRight = hardwareMap.dcMotor.get("motor_2");
    motorLeft = hardwareMap.dcMotor.get("motor_1");
    motorArmAngle = hardwareMap.dcMotor.get("motor_3");
    motorActuator = hardwareMap.dcMotor.get("motor_4");
    motorChurroGrabber = hardwareMap.dcMotor.get("motor_5");
    motorWinch = hardwareMap.dcMotor.get("motor_6");
    servoPlow = hardwareMap.servo.get("servo_1");
    precisionModeDrive = 0;
    precisionModeArm = 0;
    servoPlow.setDirection(Servo.Direction.FORWARD);
    servoPlow.setPosition(1.0);
}