@java.lang.Override
public void onLoadFinished(android.content.Loader<java.util.List<java.io.File>> loader, java.util.List<java.io.File> data) {
    listViewAdapter = new kaist.cs550_2016.poche.PlaylistActivity.PlaylistAdapter(this, R.layout.activity_playlist_list_item, data);
    playlistListView.setAdapter(listViewAdapter);
    playlistFiles = data;
    kaist.cs550_2016.poche.Debug.toastStopwatch("GetPlaylist()");
}