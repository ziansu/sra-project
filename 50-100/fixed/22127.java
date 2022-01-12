private byte[] toByteArray(java.lang.String s) {
    byte[] bytes = s.getBytes();
    byte[] ctrBytes = new byte[]{ common.messages.MessageType.LINE_FEED };
    byte[] tmp = new byte[(bytes.length) + (ctrBytes.length)];
    java.lang.System.arraycopy(bytes, 0, tmp, 0, bytes.length);
    java.lang.System.arraycopy(ctrBytes, 0, tmp, bytes.length, ctrBytes.length);
    return tmp;
}