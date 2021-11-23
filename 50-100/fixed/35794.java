@java.lang.Override
public void send(java.nio.ByteBuffer buffer) {
    if ((buffer.remaining()) == 0) {
        return ;
    }
    byte[] b = new byte[buffer.remaining()];
    buffer.get(b);
    try {
        port.writeBytes(b);
        if ((port.getOutputBufferBytesCount()) == 0) {
            raiseSendEvent();
        }else {
            SerialManager.SELF.wait(this);
        }
    } catch (jssc.SerialPortException e) {
        raiseErrorEvent(e);
    }
}