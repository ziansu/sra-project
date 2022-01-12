public static void enableSystemSound(boolean mode, android.content.Context context) {
    if ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.N)) {
        android.media.AudioManager mgr = ((android.media.AudioManager) (context.getSystemService(Context.AUDIO_SERVICE)));
        if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
            if (mode) {
                mgr.adjustStreamVolume(AudioManager.STREAM_SYSTEM, AudioManager.ADJUST_UNMUTE, 0);
            }else {
                mgr.adjustStreamVolume(AudioManager.STREAM_SYSTEM, AudioManager.ADJUST_MUTE, 0);
            }
        }else {
            mgr.setStreamMute(AudioManager.STREAM_SYSTEM, mode);
        }
    }
}