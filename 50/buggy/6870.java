void writeByte(byte b) {
    try {
        output.write(b);
        java.lang.System.out.println(("WRITE: " + b));
    } catch (java.io.IOException ex) {
        reconnect();
        throw new com.coderedrobotics.dashboard.communications.exceptions.ConnectionResetException();
    }
}