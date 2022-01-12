public void digitalWrite(int pin, int value) {
    byte[] buffer = new byte[]{ ((byte) (grovepi.GrovePi.Command.DIGITAL_WRITE)) , ((byte) (pin)) , ((byte) (value)) , Constants.UNUSED };
    java.lang.System.out.print((((("<pin-" + pin) + "=>") + value) + ">"));
    getDirectAccess().write(buffer);
}