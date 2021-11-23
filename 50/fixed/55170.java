public void handleGpioPinDigitalStateChangeEvent(com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent event) {
    java.lang.System.out.println((((" --> GPIO PIN STATE CHANGE: " + (event.getPin().getPin().getAddress())) + " = ") + (event.getState())));
}