public com.antoniotari.reactiveampache.models.SongsResponse createPlaylist(final java.lang.String auth, final java.lang.String name, @com.antoniotari.reactiveampache.api.RawRequest.PlaylistType
final java.lang.String type) throws java.lang.Exception {
    java.lang.String playlistQuery = ((((("auth=" + auth) + "&name=") + name) + "&type=") + type) + "&action=playlist_create";
    com.antoniotari.reactiveampache.utils.Log.blu((((mAmpacheUrl) + (com.antoniotari.reactiveampache.api.RawRequest.API_ENDPOINT)) + playlistQuery));
    final java.lang.String respStr = getRequest(playlistQuery, com.antoniotari.reactiveampache.api.RawRequest.Timeout.SHORT_TIMEOUT);
    return new com.antoniotari.reactiveampache.utils.SerializeUtils().fromXml(respStr, com.antoniotari.reactiveampache.models.SongsResponse.class);
}