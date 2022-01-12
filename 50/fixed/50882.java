@java.lang.Override
public void onMessage(java.nio.ByteBuffer message) {
    final byte[] data = new byte[message.remaining()];
    message.get(data);
    messages.add(data);
}