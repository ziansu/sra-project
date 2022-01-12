@java.lang.Override
public void onStop() {
    handler.removeCallbacks(seekUpdateTask);
    mMediaPlayer.stop();
    mMediaPlayer.setAudioStreamType(AudioManager.MODE_NORMAL);
    mMediaPlayer.release();
    mAudioManager.setMode(AudioManager.MODE_NORMAL);
    mAudioManager.setSpeakerphoneOn(true);
    mPreferences.getPreferences().edit().putBoolean("playerSpeaker", mSpeakerphone).apply();
    super.dismiss();
}