public void setData(android.net.Uri uri) {
    mUri = uri;
    mId = java.lang.Long.parseLong(mUri.getLastPathSegment());
    if ((mUri) != null) {
        if ((mEntryView) != null) {
            getLoaderManager().restartLoader(net.fred.feedex.fragment.EntryFragment.LOADER_ID, null, this).forceLoad();
        }
    }else
        if ((mEntryView) != null) {
            mEntryView.reset();
            mEntriesIds = null;
            setupNavigationButton();
        }
    
}