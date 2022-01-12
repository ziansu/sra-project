private java.lang.String dispatchPath() {
    java.lang.String path = null;
    if (((storageState) != (com.dvsnier.crashmonitor.utils.CrashHandler.StorageStrategy.STRATEGY_NONE)) || ((storageState) != (com.dvsnier.crashmonitor.utils.CrashHandler.StorageStrategy.STRATEGY_NO_RECOMMEND))) {
        path = interruptPath(storageState);
    }else {
        path = interruptPath();
    }
    return path;
}