public boolean runCommand(java.lang.String command) {
    try {
        outputStream.writeBytes(command);
        outputStream.flush();
        return true;
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return false;
    }
}