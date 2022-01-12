private void fetchLibraryEntries() {
    mRefreshLayout.setRefreshing(true);
    com.charlesmadere.hummingbird.networking.Api.getLibraryEntries(mUser.getName(), mWatchingStatus, new com.charlesmadere.hummingbird.fragments.AnimeLibraryFragment.GetLibraryEntriesListener(this));
}