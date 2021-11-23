@java.lang.Override
public <T> byte[] encode(org.vsg.cusp.event.Message<T> msg) {
    byte[] contBytes = new byte[0];
    try {
        contBytes = createQueryMessage(msg);
    } catch (java.io.UnsupportedEncodingException e) {
        e.printStackTrace();
    }
    return contBytes;
}