@java.lang.Override
public void write(int b) throws java.io.IOException {
    if ((buffer) == null) {
        buffer = org.wso2.carbon.messaging.BufferFactory.getInstance().getBuffer();
        addMessageBody(buffer);
    }
    if (buffer.hasRemaining()) {
        buffer.put(((byte) (b)));
    }else {
        buffer = org.wso2.carbon.messaging.BufferFactory.getInstance().getBuffer();
        addMessageBody(buffer);
        buffer.put(((byte) (b)));
    }
}