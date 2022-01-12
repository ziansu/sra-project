@java.lang.Override
public boolean isExported(com.pi4j.io.gpio.impl.GpioPin... pin) {
    if ((pin == null) || ((pin.length) == 0)) {
        throw new java.lang.IllegalArgumentException("Missing pin argument.");
    }
    for (com.pi4j.io.gpio.impl.GpioPin p : pin) {
        if (!(pins.contains(p))) {
            throw new com.pi4j.io.gpio.exception.GpioPinNotProvisionedException(p.getPin());
        }
        if (!(p.isExported())) {
            return false;
        }
    }
    return true;
}