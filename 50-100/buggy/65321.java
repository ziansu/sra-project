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
    if ((activity.getClass()) == (com.itgarage.harvey.gamecollections.activities.LoginActivity.class)) {
        android.content.Intent intent = new android.content.Intent(activity, com.itgarage.harvey.gamecollections.activities.NaviDrawerActivity.class);
        activity.startActivity(intent);
    }
}