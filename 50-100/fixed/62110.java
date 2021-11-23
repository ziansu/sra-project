protected java.util.List<kaaes.spotify.webapi.android.models.Artist> doInBackground(java.lang.String... params) {
    if ((params.length) == 0)
        return null;
    
    kaaes.spotify.webapi.android.SpotifyApi api = new kaaes.spotify.webapi.android.SpotifyApi();
    kaaes.spotify.webapi.android.SpotifyService spotify = api.getService();
    kaaes.spotify.webapi.android.models.ArtistsPager results = spotify.searchArtists(params[0]);
    return results.artists.items;
}