@java.lang.Override
public void high(com.pi4j.io.gpio.impl.GpioPinDigitalOutput... pin) {
    if ((pin == null) || ((pin.length) == 0)) {
        throw new java.lang.IllegalArgumentException("Missing pin argument.");
    }
    for (com.pi4j.io.gpio.impl.GpioPinDigitalOutput p : pin) {
        if (!(pins.contains(p))) {
            throw new com.pi4j.io.gpio.exception.GpioPinNotProvisionedException(p.getPin());
        }
        p.high();
    }
}