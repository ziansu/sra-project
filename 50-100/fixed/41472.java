@java.lang.Override
public void initialize() throws ioio.lib.api.exception.ConnectionLostException {
    if (initialized) {
        uartInput.close();
        initialized = false;
    }
    final int gpsPin = hr.djajcevic.spc.util.Configuration.getConfigInt("gps.pin");
    final int gpsFreq = hr.djajcevic.spc.util.Configuration.getConfigInt("gps.freq");
    uartInput = ioio.openUart(gpsPin, IOIO.INVALID_PIN, gpsFreq, Uart.Parity.NONE, Uart.StopBits.ONE);
    gpsDataInputStream = uartInput.getInputStream();
    initialized = true;
}