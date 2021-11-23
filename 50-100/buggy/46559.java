public void refresh(android.view.View view) {
    this.setProgressBarIndeterminate(true);
    this.setProgressBarIndeterminateVisibility(true);
    if (!(isNetworkAvailable())) {
        showDialog("No Internet Connection! Enable WiFi or 3G");
        return ;
    }
    android.os.AsyncTask readTask = new radio.app.RadioApp.ReadSongTask(this).execute(_selectedChannelName);
    try {
    } catch (java.lang.Exception e) {
    }
}