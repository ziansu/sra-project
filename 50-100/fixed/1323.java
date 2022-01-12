public void pinMode(int pin, grovepi.PinMode mode) {
    byte[] buffer = new byte[]{ ((byte) (grovepi.GrovePi.Command.PIN_MODE)) , ((byte) (pin)) , ((byte) (mode.getValue())) , Constants.UNUSED };
    getDirectAccess().write(buffer);
}