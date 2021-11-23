private void processConfig() {
    assert (currentConfig) != null;
    Storage.storageLogger.info("Retreiving save path from current Config");
    savePath = currentConfig.getSavePath();
}