@java.lang.Override
public void onClick(android.view.View v) {
    ipv.setCoverDrawable(R.drawable.no_cover);
    playlist.play(((playlist.getSongIndex()) + 1), songInfo, sharerInfo);
    playing = true;
}