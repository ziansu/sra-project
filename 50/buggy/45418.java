@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    android.media.MediaPlayer mp = com.cviac.nheart.nheartapp.fragments.MusicFragment.mp;
    if (mp != null) {
        mp.release();
    }
    doUnbindService();
}