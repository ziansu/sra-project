@java.lang.Override
protected void setup() throws ioio.lib.api.exception.ConnectionLostException {
    led_ = ioio_.openDigitalOutput(IOIO.LED_PIN, true);
    uart_1 = ioio_.openUart(new ioio.lib.api.DigitalInput.Spec(ioio.lib.api.IOIO.INVALID_PIN, DigitalInput.Spec.Mode.FLOATING), new ioio.lib.api.DigitalOutput.Spec(my.subject.HelloIOIOuart.HelloIOIOuartActivity.IOIOThread.PIN_TX, DigitalOutput.Spec.Mode.OPEN_DRAIN), 31250, Uart.Parity.NONE, Uart.StopBits.ONE);
    out = uart_1.getOutputStream();
    uart_2 = ioio_.openUart(IOIO.INVALID_PIN, my.subject.HelloIOIOuart.HelloIOIOuartActivity.IOIOThread.PIN_SERCON_TX, 9600, Uart.Parity.NONE, Uart.StopBits.ONE);
    scon = uart_2.getOutputStream();
}