@java.lang.Override
public harman.musicplayer.SongsAdapter.DataObjectHolder onCreateViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View view = android.view.LayoutInflater.from(parent.getContext()).inflate(R.layout.song_item, parent, false);
    return new harman.musicplayer.SongsAdapter.DataObjectHolder(view);
}