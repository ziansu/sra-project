@java.lang.Override
protected void onStop() {
    unregisterReceiver(playerReceiver);
    android.util.Log.d(poche.fm.potunes.PlayerActivity.TAG, "onStop: ");
    super.onStop();
}