public void setData(android.net.Uri uri) {
    mUri = uri;
    if ((mUri) != null) {
        mId = java.lang.Long.parseLong(mUri.getLastPathSegment());
    }else {
        mId = -1;
    }
    if ((mEntryView) != null) {
        mEntryView.reset();
        if ((mUri) != null) {
            getLoaderManager().restartLoader(net.fred.feedex.fragment.EntryFragment.LOADER_ID, null, this).forceLoad();
        }else {
            mEntriesIds = null;
            setupNavigationButton();
        }
    }
}