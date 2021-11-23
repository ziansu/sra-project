@java.lang.Override
public void onClick(android.view.View v) {
    play();
    songPlayerThread = new com.bitdubai.sub_app.music_player.fragments.MusicPlayerMainActivity.ThreadSong(false);
    songPlayerThread.execute();
}