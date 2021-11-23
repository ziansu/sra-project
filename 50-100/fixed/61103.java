private boolean createLogFile() {
    java.io.File file = new java.io.File(getGPSLogPath());
    if ((file.exists()) == false) {
        try {
            file.createNewFile();
        } catch (java.io.IOException e) {
            LogError(("createLogFile" + (e.toString())));
            return false;
        }
    }
    file = null;
    return true;
}