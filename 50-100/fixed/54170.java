@java.lang.Override
public void loop() {
    if ((gamepad1.a) && ((time.time()) > (com.qualcomm.ftcrobotcontroller.opmodes.SirHammerEncoderTest.DELAY))) {
        targetPosition = com.qualcomm.ftcrobotcontroller.opmodes.SirHammerEncoderTest.FIRST_POSITION;
        setAllMotorPowers();
    }
    if ((gamepad1.b) && ((time.time()) > (com.qualcomm.ftcrobotcontroller.opmodes.SirHammerEncoderTest.DELAY))) {
        targetPosition = com.qualcomm.ftcrobotcontroller.opmodes.SirHammerEncoderTest.SECOND_POSITION;
        setAllMotorPowers();
    }
    if (gamepad1.x) {
        resetAllMotors();
    }
    telemetry.addData("target:", targetPosition);
}