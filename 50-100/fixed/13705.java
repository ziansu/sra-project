@java.lang.Override
public void OnArtistListFragmentInteractionListener(kaaes.spotify.webapi.android.models.Artist artist) {
    com.oansari.spotifystreamer.views.TopTracksFragment topTracksFragment = com.oansari.spotifystreamer.views.TopTracksFragment.newInstance(artist.id, artist.name);
    getFragmentManager().beginTransaction().hide(artistListFragment).add(R.id.fragment, topTracksFragment).addToBackStack(null).commit();
}