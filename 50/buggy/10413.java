@java.lang.Override
protected void onPreExecute() {
    super.onPreExecute();
    sendBroadcast(new android.content.Intent("com.udacity.gradle.builditbigger.showprogress"));
}