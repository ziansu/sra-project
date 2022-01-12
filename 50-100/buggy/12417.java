@java.lang.Override
public void onClick(android.view.View v) {
    if ((getMediaController()) != null) {
        if (item != (getPlaybackManager().getPlaylist())) {
            org.tomahawk.libtomahawk.collection.StationPlaylist stationPlaylist = org.tomahawk.libtomahawk.collection.StationPlaylist.get(((org.tomahawk.libtomahawk.collection.Playlist) (item)));
            getPlaybackManager().setPlaylist(stationPlaylist);
            getMediaController().getTransportControls().play();
        }
    }
}