public boolean startup() {
    return ((((_client.open()) && (_directoryDbCtx.open(_config.getDirDbFilePath()))) && (_notificationDbCtx.open(_config.getNotifDbFilePath()))) && (_registrator.register())) && (_synchronizationWorker.start());
}