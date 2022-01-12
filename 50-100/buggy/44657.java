@java.lang.Override
public void success(final kaaes.spotify.webapi.android.models.Album album, retrofit.client.Response response) {
    mAlbum = album;
    setupDetails(album);
    setupTracksRows(album.tracks.items);
    if ((album.images.size()) > 0) {
        java.lang.String imageUrl = album.images.get(0).url;
        loadBackgroundImage(imageUrl);
        loadDetailsRowImage(imageUrl);
    }
}