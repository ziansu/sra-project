@java.lang.Override
protected void onResume() {
    super.onResume();
    com.filreas.shared.utils.GoSthlmLog.d("onResume");
    googleApiClient.connect();
}