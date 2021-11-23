public void registerReceiver() {
    broadcastReceiver = new com.kiwi.flickrbatchdownload.photolist.PhotoListActivity.MBroadcastReceiver();
    android.support.v4.content.LocalBroadcastManager.getInstance(this).registerReceiver(broadcastReceiver, new android.content.IntentFilter(com.kiwi.flickrbatchdownload.download.DownloadService.IMAGE_TASKINFO_SENDBACK_ACTION));
}