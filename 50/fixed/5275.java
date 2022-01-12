public boolean runCommand(java.lang.String command) {
    try {
        this.outputStream.writeBytes(command);
        return true;
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return false;
    }
}