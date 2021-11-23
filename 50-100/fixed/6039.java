public boolean clearLogFiles() {
    try {
        if ((_logFileDos) != null) {
            _logFileDos.close();
        }
    } catch (java.io.IOException e) {
        android.util.Log.e("BleLog", "Error closing logfile", e);
        return false;
    }
    java.io.File[] files = getLogFiles();
    for (java.io.File file : files) {
        if (!(file.delete())) {
            return false;
        }
    }
    return true;
}