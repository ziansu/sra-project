public void enableTurning(boolean enable) {
    if (enable) {
        wheelMotor.enableControl();
    }else {
        java.lang.System.out.println(("Disabled " + (canId)));
        wheelMotor.disableControl();
    }
}