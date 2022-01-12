private void disconnectFromDataApi() {
    if (((googleApiClient) != null) && (googleApiClient.isConnected())) {
        com.filreas.shared.utils.GoSthlmLog.d("Disconnected from DataApi");
        Wearable.DataApi.removeListener(googleApiClient, this);
        Wearable.MessageApi.removeListener(googleApiClient, this);
        googleApiClient.disconnect();
    }
}