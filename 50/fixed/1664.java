@java.lang.Override
public void refreshState() {
    timber.log.Timber.d("Artoo link connected.");
    startVideoManager();
    loadSololinkWifiInfo();
    refreshControllerVersions();
    loadCurrentEUTxPowerComplianceMode();
}