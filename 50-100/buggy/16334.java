@java.lang.Override
public void onResume() {
    super.onResume();
    android.os.Bundle arguments = getActivity().getIntent().getExtras();
    if (arguments != null) {
        spotifyArtistModel = arguments.getParcelable(com.akodiakson.udacity.portfolio.fragment.TopTracksFragment.EXTRA_SPOTIFY_ARTIST);
    }else {
        spotifyArtistModel = getArguments().getParcelable(com.akodiakson.udacity.portfolio.fragment.TopTracksFragment.EXTRA_SPOTIFY_ARTIST);
    }
    setupToolbar();
    setupTopTracksList();
    showArtistImage();
    if (topTracks.isEmpty()) {
        searchArtistTopTracks();
    }
}