private void turnMotors() {
    if ((enMotorL) != null)
        enMotorL.close();
    
    if ((enMotorR) != null)
        enMotorR.close();
    
    if ((reMotorL) == null) {
        reMotorL = new lejos.hardware.motor.EV3MediumRegulatedMotor(ca.ualberta.ev3ye.robot.MainActivity.motorL);
        reMotorL.resetTachoCount();
    }
    if ((reMotorR) == null) {
        reMotorR = new lejos.hardware.motor.EV3MediumRegulatedMotor(ca.ualberta.ev3ye.robot.MainActivity.motorR);
        reMotorR.resetTachoCount();
    }
}