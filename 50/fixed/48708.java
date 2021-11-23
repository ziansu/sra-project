public void testStopRightMotor() {
    phiro.initialise();
    doTestFirmataInitialization();
    phiro.stopRightMotor();
    testSpeed(0, org.catrobat.catroid.test.devices.phiro.PhiroImplTest.PIN_RIGHT_MOTOR_SPEED);
}