@java.lang.Override
protected void onActivityResult(int requestCode, int resultCode, android.content.Intent data) {
    if (requestCode == 1) {
        PlaylistAdapter.PlaylistCheckboxList.clear();
        com.leokomarov.jamstreamer.playlist.PlaylistAdapter.PlaylistCheckboxCount = 0;
    }
}