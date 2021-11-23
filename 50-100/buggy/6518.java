public boolean containsModifications(final com.charlesmadere.hummingbird.models.LibraryEntry libraryEntry) {
    return ((((((((mEpisodesWatched) != null) || ((mRewatching) != null)) || ((mRewatchedTimes) != null)) || ((mPrivacy) != null)) || ((mNotes) != null)) || ((mWatchingStatus) != null)) || ((mRating) != null)) || (((mSaneRating) == null) && (libraryEntry.hasRating()));
}