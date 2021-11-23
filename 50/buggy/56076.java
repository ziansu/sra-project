@java.lang.Override
public void handleGpioPinDigitalStateChangeEvent(com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent event) {
    java.lang.System.out.println("Someone is here");
    object.notifyAll();
}