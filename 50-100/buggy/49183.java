@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    if ((mSearchFragment) != null) {
        getSupportFragmentManager().putFragment(outState, "search_fragment", mSearchFragment);
    }
    if ((mTracksFragment) != null) {
        getSupportFragmentManager().putFragment(outState, "tracks_fragment", mTracksFragment);
    }
}