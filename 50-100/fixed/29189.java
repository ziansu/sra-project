@java.lang.Override
public int onStartCommand(android.content.Intent intent, int flags, int startId) {
    if (intent == null)
        return super.onStartCommand(intent, flags, startId);
    
    if (intent.getBooleanExtra("STATE", true)) {
        stopMusic();
    }else {
        playMusic(song_id, onMusicEndListener, Title);
        com.singtogether.yapy.singtogether.MainActivity.getInstance().checkPlaying();
    }
    return super.onStartCommand(intent, flags, startId);
}