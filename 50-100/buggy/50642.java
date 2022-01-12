@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    try {
        mListener = ((com.oansari.spotifystreamer.views.ArtistListFragment.OnArtistListFragmentInteractionListener) (activity));
    } catch (java.lang.ClassCastException e) {
        throw new java.lang.ClassCastException(((activity.toString()) + " must implement OnFragmentInteractionListener"));
    }
    final com.oansari.spotifystreamer.Spotify spotify = new com.oansari.spotifystreamer.Spotify();
    mSpotifyApi = new kaaes.spotify.webapi.android.SpotifyApi();
    mSpotifyService = mSpotifyApi.getService();
}