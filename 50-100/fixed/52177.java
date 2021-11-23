@java.lang.Override
public void onStart() {
    super.onStart();
    android.util.Log.v("5", "onStart");
    if (mRegisterReceiver) {
        android.support.v4.content.LocalBroadcastManager.getInstance(this).registerReceiver(mReceiver, new android.content.IntentFilter("sendTrackPosition"));
        mRegisterReceiver = false;
    }else {
        android.util.Log.e(no.ahoi.spotify.spotifystreamer.SpotifyStreamerActivity.LOG_TAG, "Could not start broadcastReceiver.");
    }
}