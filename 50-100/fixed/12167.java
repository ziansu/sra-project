public void onDestroy() {
    super.onDestroy();
    if ((lyricViewer) != null) {
        lyricViewer.dismiss();
    }
    if ((mRemoteTrackTime) != null) {
        mRemoteTrackTime.unregister();
    }
    try {
        if ((mTrackIntent) != null) {
            unregisterReceiver(mTrackReceiver);
        }
        if ((mStatusIntent) != null) {
            unregisterReceiver(mStatusReceiver);
        }
    } catch (java.lang.Exception e) {
    }
}