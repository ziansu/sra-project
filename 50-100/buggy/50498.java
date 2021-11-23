private void disableSound(android.content.SharedPreferences.Editor editor) {
    android.content.SharedPreferences settings = android.preference.PreferenceManager.getDefaultSharedPreferences(this);
    if (settings.getBoolean("disable_sound", true)) {
        android.media.AudioManager audio = ((android.media.AudioManager) (this.getApplicationContext().getSystemService(Context.AUDIO_SERVICE)));
        int volume = audio.getStreamVolume(AudioManager.STREAM_SYSTEM);
        editor.putInt(getString(R.string.pre_start_volume), volume);
        editor.commit();
        audio.setStreamVolume(AudioManager.STREAM_SYSTEM, 0, AudioManager.FLAG_REMOVE_SOUND_AND_VIBRATE);
    }
}