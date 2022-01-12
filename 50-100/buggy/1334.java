private void send(com.google.android.gms.wearable.PutDataRequest putDataRequest) {
    if (validateConnection()) {
        android.util.Log.i(edu.ucla.nesl.android.hrmonitor.DataMapClient.TAG, "Sending PutDataRequest...");
        Wearable.DataApi.putDataItem(googleApiClient, putDataRequest).setResultCallback(new com.google.android.gms.common.api.ResultCallback<com.google.android.gms.wearable.DataApi.DataItemResult>() {
            @java.lang.Override
            public void onResult(com.google.android.gms.wearable.DataApi.DataItemResult dataItemResult) {
                android.util.Log.v(edu.ucla.nesl.android.hrmonitor.DataMapClient.TAG, ("Sending data message: " + (dataItemResult.getStatus().isSuccess())));
            }
        });
    }else {
        android.util.Log.w(edu.ucla.nesl.android.hrmonitor.DataMapClient.TAG, "Connection not valid");
    }
}