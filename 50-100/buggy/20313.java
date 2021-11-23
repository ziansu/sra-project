public boolean isOnline() {
    java.lang.Runtime runtime = java.lang.Runtime.getRuntime();
    try {
        java.lang.Process ipProcess = runtime.exec("/system/bin/ping -c 1 8.8.8.8");
        int exitValue = ipProcess.waitFor();
        return exitValue == 0;
    } catch (java.io.IOException e) {
        e.printStackTrace();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    return false;
}