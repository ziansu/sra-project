@java.lang.Override
public void received(java.nio.ByteBuffer buffer) {
    if (r != null) {
        r.received(buffer);
    }
}