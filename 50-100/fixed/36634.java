@java.lang.Override
public void onMessage(byte[] buffer, int offset, int length) {
    byte[] newMessage = new byte[length];
    java.lang.System.arraycopy(buffer, offset, newMessage, 0, length);
    results.add(newMessage);
}