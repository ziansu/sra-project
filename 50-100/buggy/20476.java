@java.lang.Override
public void onRefresh() {
    if (networkConnectionManager.checkNetworkConnection()) {
        getServerData();
    }else
        if (settingsManager.checkIfCacheIsAvailable()) {
            displayUpdateInformation(buildOfflineCyanogenOTAUpdate(), false, false);
        }else {
            showNetworkError();
        }
    
}