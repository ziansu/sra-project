protected java.util.List<java.lang.String> doInBackground(java.lang.String... params) {
    if ((params.length) == 0)
        return null;
    
    kaaes.spotify.webapi.android.SpotifyApi api = new kaaes.spotify.webapi.android.SpotifyApi();
    kaaes.spotify.webapi.android.SpotifyService spotify = api.getService();
    kaaes.spotify.webapi.android.models.ArtistsPager results = spotify.searchArtists(params[0]);
    java.util.List<kaaes.spotify.webapi.android.models.Artist> artists = results.artists.items;
    java.util.List<java.lang.String> names = new java.util.ArrayList<java.lang.String>();
    for (kaaes.spotify.webapi.android.models.Artist artist : artists)
        names.add(artist.name);
    
    return names;
}