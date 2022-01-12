private void execPingMessage(java.lang.String msg) {
    java.lang.StringBuilder buf = new java.lang.StringBuilder();
    buf.append("PONG");
    if (msg != null) {
        buf.append(' ').append(msg);
    }
    buf.append('\n');
    writeString(buf.toString());
}