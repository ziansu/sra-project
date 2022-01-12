public void brake(int motorNum) throws ioio.lib.api.exception.ConnectionLostException {
    if (closed_)
        return ;
    
    if ((motorNum == 1) || (motorNum == 3)) {
        motor1Out1_.write(true);
        motor1Out2_.write(true);
        motor1PWM_.setDutyCycle(1);
    }
    if ((motorNum == 2) || (motorNum == 3)) {
        motor2Out1_.write(true);
        motor2Out2_.write(true);
        motor2PWM_.setDutyCycle(1);
    }
}