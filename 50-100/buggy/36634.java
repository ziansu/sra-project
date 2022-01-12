@java.lang.Override
public void onMessage(final byte[] buffer, final int offset, final int length) {
    byte[] newMessage = new byte[length];
    java.lang.System.arraycopy(buffer, offset, newMessage, 0, length);
    results.add(newMessage);
}