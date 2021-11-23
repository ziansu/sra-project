public java.lang.String status() {
    try {
        if ((processManager) instanceof org.artofsolving.jodconverter.process.PureJavaProcessManager) {
            status = org.nuxeo.launcher.NuxeoLauncher.STATUS_CODE_UNKNOWN;
            return "Can't check server status on your OS.";
        }
        if ((getPid()) == null) {
            status = org.nuxeo.launcher.NuxeoLauncher.STATUS_CODE_OFF;
            return "Server is not running.";
        }else {
            status = org.nuxeo.launcher.NuxeoLauncher.STATUS_CODE_ON;
            return ("Server is running with process ID " + (getPid())) + ".";
        }
    } catch (java.io.IOException e) {
        status = org.nuxeo.launcher.NuxeoLauncher.STATUS_CODE_UNKNOWN;
        return ("Could not check existing process (" + (e.getMessage())) + ").";
    } finally {
        errorValue = status;
    }
}