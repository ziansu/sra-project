@java.lang.Override
public void onDestroy() {
    if ((mAudioPlayer) != null) {
        mAudioPlayer.release();
        mAudioPlayer = null;
    }
    unregisterReceiver(mServiceReceiver);
    super.onDestroy();
}