@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    (mNumRequests)--;
    if (((mNumRequests) == 0) && (mIsSearching)) {
        mIsSearching = false;
        mAdapter.setArtists(new java.util.ArrayList<com.growingcoder.spotifystreamer.search.SpotifyArtist>());
        postEvent(new com.growingcoder.spotifystreamer.core.BusManager.ArtistSearchEvent());
    }
}