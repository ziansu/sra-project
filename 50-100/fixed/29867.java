@java.lang.Override
public void success(final kaaes.spotify.webapi.android.models.Album album, retrofit.client.Response response) {
    if ((!(isAdded())) || ((getActivity()) == null)) {
        return ;
    }
    mAlbum = album;
    mAlbumTrackUris = com.sregg.android.tv.spotifyPlayer.utils.Utils.getTrackUrisFromTrackPager(mAlbum.tracks);
    onContentLoaded(album);
    if ((album.images.size()) > 0) {
        java.lang.String imageUrl = album.images.get(0).url;
        loadDetailsRowImage(imageUrl);
    }
}