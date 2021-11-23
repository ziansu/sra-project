@java.lang.Override
public void success(com.sregg.android.tv.spotify.fragments.PlaylistsPager playlistsPager, retrofit.client.Response response) {
    com.sregg.android.tv.spotify.fragments.ArrayObjectAdapter listRowAdapter = new com.sregg.android.tv.spotify.fragments.ArrayObjectAdapter(new com.sregg.android.tv.spotify.presenters.PlaylistCardPresenter());
    for (com.sregg.android.tv.spotify.fragments.PlaylistSimple playlistSimple : playlistsPager.playlists.items) {
        com.sregg.android.tv.spotify.fragments.Playlist playlist = com.sregg.android.tv.spotify.SpotifyTvApplication.getInstance().getSpotifyService().getPlaylist(playlistSimple.owner.id, playlistSimple.id);
        listRowAdapter.add(playlist);
    }
    com.sregg.android.tv.spotify.fragments.HeaderItem header = new com.sregg.android.tv.spotify.fragments.HeaderItem(getString(R.string.playlists));
    mRowsAdapter.add(new com.sregg.android.tv.spotify.fragments.ListRow(header, listRowAdapter));
}