@java.lang.Override
public void setMode(com.pi4j.io.gpio.impl.PinMode mode, com.pi4j.io.gpio.impl.GpioPin... pin) {
    if ((pin == null) || ((pin.length) == 0)) {
        throw new java.lang.IllegalArgumentException("Missing pin argument.");
    }
    for (com.pi4j.io.gpio.impl.GpioPin p : pin) {
        if (!(pins.contains(p))) {
            throw new com.pi4j.io.gpio.exception.GpioPinNotProvisionedException(p.getPin());
        }
        p.setMode(mode);
    }
}