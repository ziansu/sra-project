@java.lang.Override
public void onClick(android.view.View v) {
    if ((getMediaController()) != null) {
        org.tomahawk.libtomahawk.collection.StationPlaylist stationPlaylist = org.tomahawk.libtomahawk.collection.StationPlaylist.get(((org.tomahawk.libtomahawk.collection.Playlist) (item)));
        if (stationPlaylist != (getPlaybackManager().getPlaylist())) {
            getPlaybackManager().setPlaylist(stationPlaylist);
            getMediaController().getTransportControls().play();
        }
    }
}