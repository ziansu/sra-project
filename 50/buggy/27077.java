public void setSpindleSpeedPWM(int pwm) throws replicatorg.drivers.RetryException {
    machine.currentTool().setSpindleSpeedPWM(pwm);
}