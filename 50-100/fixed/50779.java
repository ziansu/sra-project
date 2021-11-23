@java.lang.Override
public void onResume() {
    super.onResume();
    int music_position = mSharedPref.getInt(getString(R.string.music_position), 0);
    float current_volume = mSharedPref.getFloat(getString(R.string.saved_volume_setting), 1);
    mMediaPlayer.setVolume(current_volume, current_volume);
    mMediaPlayer.seekTo(music_position);
    mMediaPlayer.start();
}