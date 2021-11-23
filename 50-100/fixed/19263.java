@java.lang.Override
public void onClick(android.view.View v) {
    if ((tk.lefourretoutsonore.lefourre_toutsonore.DataHolder.getInstance().getPlaylist().getSongIndex()) > 0) {
        playing = true;
        findViewById(R.id.control).setBackgroundResource(R.drawable.pause);
        tk.lefourretoutsonore.lefourre_toutsonore.DataHolder.getInstance().getPlaylist().play(((tk.lefourretoutsonore.lefourre_toutsonore.DataHolder.getInstance().getPlaylist().getSongIndex()) - 1));
    }
}