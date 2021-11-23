@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d(starace.learn.com.musicfilter.Song.SongListAdapter.TAG_SONG_ADAPTER, ("This item has been clicked " + position));
    starace.learn.com.musicfilter.Song.SongListAdapter.RecyclerClickEvent clickEvent = new starace.learn.com.musicfilter.Song.SongListFragment();
    clickEvent.handleRecyclerClickEvent(curSong.getUri());
}