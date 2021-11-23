public void run() {
    if ((toast) != null) {
        toast.cancel();
    }
    if ((artists.size()) == 0) {
        displayToast();
    }
    adapterSearchResults.clear();
    simpleArtists.clear();
    for (kaaes.spotify.webapi.android.models.Artist artist : artists) {
        simpleArtists.add(new com.dkulon.spotifystreamer.SpotifyObject(artist));
    }
    adapterSearchResults.addAll(simpleArtists);
    adapterSearchResults.notifyDataSetChanged();
}