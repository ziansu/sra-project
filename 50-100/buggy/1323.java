public void pinMode(int pin, grovepi.PinMode mode) {
    byte[] buffer = new byte[]{ ((byte) (grovepi.GrovePi.Command.PIN_MODE)) , ((byte) (pin)) , ((byte) (mode.getValue())) , Constants.UNUSED };
    getDirectAccess().write(buffer);
    java.lang.System.out.println((((((("DEBUG: Mode for pin " + pin) + " = ") + mode) + " (") + (mode.getValue())) + ")."));
}