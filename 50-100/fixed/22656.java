private void populatePlaylist() {
    if ((playlistName) == null) {
        return ;
    }
    yoctobyte.yoctomp.data.Database db = new yoctobyte.yoctomp.data.Database(getActivity());
    yoctobyte.yoctomp.data.TrackTable playlistTable = db.getTablePlaylist(playlistName);
    playlistAdapter.clear();
    tracks.clear();
    for (yoctobyte.yoctomp.data.Track track : playlistTable.readTracks()) {
        playlistAdapter.addTrack(track);
        tracks.add(track);
    }
    playlistAdapter.notifyDataSetChanged();
}