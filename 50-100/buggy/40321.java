public void run() {
    try {
        myMain.setwait(true, this);
        motor.setShutdownOptions(true, PinState.LOW);
        motor.pulse(duration, true);
        myMain.setwait(false, this);
    } catch (java.lang.Exception e) {
        myMain.setwait(false, this);
        e.printStackTrace();
    }
}