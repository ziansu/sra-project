private void execPingMessage(java.util.StringTokenizer tok) {
    java.lang.StringBuilder buf = new java.lang.StringBuilder();
    buf.append("PONG");
    while (tok.hasMoreTokens()) {
        buf.append(' ').append(tok.nextToken());
    } 
    buf.append('\n');
    writeString(buf.toString());
}