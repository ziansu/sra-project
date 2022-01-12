public void digitalWrite(int pin, int value) {
    byte[] buffer = new byte[]{ ((byte) (grovepi.GrovePi.Command.DIGITAL_WRITE)) , ((byte) (pin)) , ((byte) (value)) , Constants.UNUSED };
    getDirectAccess().write(buffer);
}