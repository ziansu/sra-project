void yieldToDebug(boolean allThreadsSuspended) {
    if (fDebug) {
        java.lang.String line = "";
        try {
            if (allThreadsSuspended || (fCommandReceiveStream.ready())) {
                line = fCommandReceiveStream.readLine();
                processDebugCommand(line);
            }
        } catch (java.io.IOException e) {
            java.lang.System.err.println(("Error: " + e));
            java.lang.System.exit(1);
        }
    }
}