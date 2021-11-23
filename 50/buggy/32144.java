@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    doUnbindService();
    unregisterReceiver(myNoisyAudioStreamReceiver);
    android.util.Log.d(com.fritzbang.theplayer.ThePlayerActivity.DEBUG_TAG, "destroying activity");
}