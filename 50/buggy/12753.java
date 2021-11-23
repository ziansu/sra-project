@java.lang.Override
public void setDutyCycle(double dutyCycle) {
    _board.softPwmManager.setDutyCycle(_pin, dutyCycle);
}