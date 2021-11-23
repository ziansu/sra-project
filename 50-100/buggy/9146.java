@java.lang.Override
public void success(final kaaes.spotify.webapi.android.models.Playlist playlist, retrofit.client.Response response) {
    mPlaylist = playlist;
    setupDetails(playlist);
    java.util.List<kaaes.spotify.webapi.android.models.TrackSimple> tracks = new java.util.ArrayList<kaaes.spotify.webapi.android.models.TrackSimple>();
    for (kaaes.spotify.webapi.android.models.PlaylistTrack playlistTrack : playlist.tracks.items) {
        tracks.add(playlistTrack.track);
    }
    setupTracksRows(tracks);
    if ((playlist.images.size()) > 0) {
        java.lang.String imageUrl = playlist.images.get(0).url;
        loadBackgroundImage(imageUrl);
        loadDetailsRowImage(imageUrl);
    }
}