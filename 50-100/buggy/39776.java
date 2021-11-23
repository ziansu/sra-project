private void writeCommand(com.arksine.aoaportforward.PortCommand command) {
    byte[] commandBuf = java.nio.ByteBuffer.allocate(4).put(command.getBytes()).putShort(((short) (4))).array();
    writeToAccessory(commandBuf, 4);
}