public void startReading() {
    try {
        inputPort.removeListener();
    } catch (jssc.SerialPortException e) {
        e.printStackTrace();
    }
    try {
        inputPort.addEventListener(reader);
    } catch (java.util.TooManyListenersException e) {
        e.printStackTrace();
    } catch (jssc.SerialPortException e) {
        e.printStackTrace();
    }
}