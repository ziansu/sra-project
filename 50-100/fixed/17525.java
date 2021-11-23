@java.lang.Override
public void write(int b) throws java.io.IOException {
    if ((buffer) == null) {
        buffer = org.wso2.carbon.messaging.BufferFactory.getInstance().getBuffer();
    }
    if (buffer.hasRemaining()) {
        buffer.put(((byte) (b)));
    }else {
        addMessageBody(buffer);
        buffer = org.wso2.carbon.messaging.BufferFactory.getInstance().getBuffer();
        buffer.put(((byte) (b)));
    }
}