@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    mSongDecoration = new com.nulldreams.bemusic.adapter.SongDecoration(getContext());
    getRecyclerView().addItemDecoration(mSongDecoration);
    java.util.List<com.nulldreams.media.model.Song> songs = com.nulldreams.media.manager.PlayManager.getInstance(getContext()).getTotalList();
    setSongList(songs);
}