@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    AlbumsByNameAdapter.AlbumsByNameCheckboxList.clear();
    AlbumsByNameAdapter.AlbumsByNameCheckboxCount = 0;
    if (requestCode == 1) {
        PlaylistAdapter.PlaylistCheckboxList.clear();
        com.leokomarov.jamstreamer.playlist.PlaylistAdapter.PlaylistCheckboxCount = 0;
    }
    if (requestCode == 2) {
        TracksByNameAdapter.TracksByNameCheckboxList.clear();
        TracksByNameAdapter.TracksByNameCheckboxCount = 0;
    }
}