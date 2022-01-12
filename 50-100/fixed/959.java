@java.lang.Override
public void success(com.sregg.android.tv.spotify.fragments.PlaylistsPager playlistsPager, retrofit.client.Response response) {
    com.sregg.android.tv.spotify.fragments.ArrayObjectAdapter listRowAdapter = new com.sregg.android.tv.spotify.fragments.ArrayObjectAdapter(new com.sregg.android.tv.spotify.presenters.PlaylistCardPresenter());
    for (com.sregg.android.tv.spotify.fragments.PlaylistSimple playlistSimple : playlistsPager.playlists.items) {
        listRowAdapter.add(playlistSimple);
    }
    com.sregg.android.tv.spotify.fragments.HeaderItem header = new com.sregg.android.tv.spotify.fragments.HeaderItem(getString(R.string.playlists));
    mRowsAdapter.add(new com.sregg.android.tv.spotify.fragments.ListRow(header, listRowAdapter));
}