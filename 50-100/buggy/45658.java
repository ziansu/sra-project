private void initializeAfterSettingDexterHome() {
    if (com.google.common.base.Strings.isNullOrEmpty(com.samsung.sec.dexter.core.config.DexterConfig.getInstance().getDexterHome())) {
        return ;
    }
    unzipDexterCliZipFile();
    setWindowTitleWithLoginInformation();
    initializeSourceInsightEnvironment();
    startMonitorForDexterConfigFile();
    if ((java.lang.System.getProperty("isPlatzAlive")) == "true") {
        startMonitorForPlatzKeywordFile();
    }
    setSourceInsightStatusRegistryAsRunning();
}