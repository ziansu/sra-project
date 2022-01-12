public void enableTurning(boolean enable) {
    if (enable) {
        wheelMotor.enableControl();
    }else {
        wheelMotor.disableControl();
    }
}