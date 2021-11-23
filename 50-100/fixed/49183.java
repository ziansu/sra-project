@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if ((mSearchFragment) != null) {
        getSupportFragmentManager().putFragment(outState, "search_fragment", mSearchFragment);
    }
    if ((mTracksFragment) != null) {
        getSupportFragmentManager().putFragment(outState, "tracks_fragment", mTracksFragment);
    }
}