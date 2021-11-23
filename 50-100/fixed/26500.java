@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent intent = getIntentValue();
    java.lang.String musicUrl = intent.getStringExtra("musicUrl");
    android.util.Log.v("Media URL is: ", musicUrl);
    mp = new com.app.deemounus.musiccards.MediaPlayback(ctx, musicUrl);
    switch (v.getId()) {
        case R.id.playSong :
            mp.playMedia();
            break;
        case R.id.stopSong :
            mp.stopMedia();
            break;
    }
}