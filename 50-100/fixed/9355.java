public boolean startup() {
    boolean result = (((_client.open()) && (_directoryDbCtx.open(_config.getDirDbFilePath()))) && (_notificationDbCtx.open(_config.getNotifDbFilePath()))) && (_registrator.register());
    if (result) {
        result &= _synchronizationWorker.start();
    }
    return result;
}