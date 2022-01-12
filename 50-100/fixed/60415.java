@java.lang.Override
public void onCreate() {
    super.onCreate();
    if ((player) == null) {
        player = android.media.MediaPlayer.create(this, R.raw.song);
        player.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() {
            @java.lang.Override
            public void onCompletion(android.media.MediaPlayer mp) {
                state = State.Idle;
                sendState();
            }
        });
        sendState();
    }
}