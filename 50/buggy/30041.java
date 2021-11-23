@java.lang.Override
public void close() throws java.io.IOException {
    try {
        flush();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    } finally {
        org.msgpack.core.MessagePacker messagePacker = getMessagePacker();
        messagePacker.close();
    }
}