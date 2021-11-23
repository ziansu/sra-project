public void run() {
    if (!(org.hisp.dhis.android.sdk.network.managers.NetworkManager.hasInternetConnection()))
        onFinishSending(false);
    else
        sendTrackedEntityInstances();
    
}