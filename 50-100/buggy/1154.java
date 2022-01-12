private int executeCommand(java.lang.String command) {
    try {
        java.lang.Process p = java.lang.Runtime.getRuntime().exec(("cmd /c " + command));
        p.waitFor();
        return p.exitValue();
    } catch (java.io.IOException e) {
        java.lang.System.err.println((((("Command not found! (#" + (this.ID)) + " - ") + command) + ")"));
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    return -1;
}