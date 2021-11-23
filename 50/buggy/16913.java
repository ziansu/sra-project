private void setupUIElements() {
    setTitle(getString(R.string.browse_title));
    setHeadersState(com.karmacons.a123movie.HEADERS_ENABLED);
    setHeadersTransitionOnBackEnabled(true);
    setBrandColor(getResources().getColor(R.color.fastlane_background));
    setSearchAffordanceColor(getResources().getColor(R.color.search_opaque));
}