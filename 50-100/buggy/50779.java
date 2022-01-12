@java.lang.Override
public void onResume() {
    super.onResume();
    int music_position = mSharedPref.getInt(getString(R.string.music_position), 0);
    double current_volume = mSharedPref.getFloat(getString(R.string.saved_volume_setting), 1);
    int volume_int = ((int) (current_volume * 100));
    mMediaPlayer.setVolume(volume_int, volume_int);
    mMediaPlayer.seekTo(music_position);
    mMediaPlayer.start();
}