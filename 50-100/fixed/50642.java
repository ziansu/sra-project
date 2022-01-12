@java.lang.Override
public void onAttach(android.app.Activity activity) {
    super.onAttach(activity);
    try {
        mListener = ((com.oansari.spotifystreamer.views.ArtistListFragment.OnArtistListFragmentInteractionListener) (activity));
    } catch (java.lang.ClassCastException e) {
        throw new java.lang.ClassCastException(((activity.toString()) + " must implement OnFragmentInteractionListener"));
    }
    mSpotifyApi = new kaaes.spotify.webapi.android.SpotifyApi();
    mSpotifyService = mSpotifyApi.getService();
}