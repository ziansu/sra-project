public boolean isNetAccessible() {
    boolean result = false;
    try {
        java.lang.Process pingProcess = java.lang.Runtime.getRuntime().exec(((xaurora.system.SystemManager.COMMAND_PING) + (xaurora.system.SystemManager.HOST_DROPBOX)));
        try {
            result = (pingProcess.waitFor()) == (xaurora.system.SystemManager.INTERNAL_SUCCESS);
            java.lang.System.out.println(result);
            pingProcess.destroy();
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return result;
}