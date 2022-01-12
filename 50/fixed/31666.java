@java.lang.Override
public void onClick(android.view.View v) {
    playlist.play(((playlist.getSongIndex()) + 1), songInfo, sharerInfo);
    playing = true;
}