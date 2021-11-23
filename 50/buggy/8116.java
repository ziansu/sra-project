@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    if ((mTracksFragment) != null) {
        getSupportFragmentManager().putFragment(outState, "tracks_fragment", mTracksFragment);
    }
}