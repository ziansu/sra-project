@java.lang.Override
public void onDestroy() {
    unregisterReceiver(mServiceReceiver);
    if ((mAudioPlayer) != null) {
        mAudioPlayer.release();
        mAudioPlayer = null;
    }
    super.onDestroy();
}