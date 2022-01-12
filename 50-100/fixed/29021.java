public void sendCommand(byte cmd, java.lang.String cmdStr) {
    int len = cmdStr.length();
    byte[] out = java.nio.ByteBuffer.allocate((1 + len)).put(cmd).put(cmdStr.getBytes()).array();
    write(out);
}