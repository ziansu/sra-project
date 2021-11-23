public void handleMessage(android.os.Message msg) {
    musiclist.setAdapter(((android.widget.ListAdapter) (new com.salt.saltmusic.Home.MusicListAdapter())));
}