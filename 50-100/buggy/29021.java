public void sendCommand(byte cmd, java.lang.String cmdStr) {
    int len = cmdStr.length();
    byte[] out = java.nio.ByteBuffer.allocate((6 + len)).put(cmd).put(com.notalenthack.blaster.Utils.intToByteArray(len)).put(cmdStr.getBytes()).array();
    write(out);
}