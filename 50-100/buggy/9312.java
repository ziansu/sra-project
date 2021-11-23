private float sendCommand(byte command) {
    try {
        dos.writeByte(command);
        dos.flush();
        return dis.readBoolean();
    } catch (java.io.IOException ioe) {
        java.lang.System.err.println("IO Exception");
        java.lang.System.exit(1);
        return -1.0F;
    }
}