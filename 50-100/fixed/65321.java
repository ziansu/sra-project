@java.lang.Override
public void onSuccess(com.amazonaws.mobileconnectors.cognito.Dataset dataset, final java.util.List<com.amazonaws.mobileconnectors.cognito.Record> newRecords) {
    android.util.Log.i("Sync", "success");
    if (mergeInProgress)
        return ;
    
    activity.runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            dialog.dismiss();
        }
    });
}