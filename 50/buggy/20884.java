@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    mAudioManager.abandonAudioFocus(this);
}