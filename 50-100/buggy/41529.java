private void nrfSpiWrite(int reg, byte[] data) throws jpigpio.PigpioException {
    csnLow();
    byte[] regData = new byte[]{ ((byte) (reg)) };
    pigpio.spiXfer(handle, regData, regData);
    if (data != null) {
        pigpio.spiXfer(handle, data, data);
    }
    csnHigh();
    pigpio.gpioDelay(100, JPigpio.PI_MILLISECONDS);
}