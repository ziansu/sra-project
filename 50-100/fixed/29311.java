public void searchContacts(java.lang.String query) {
    android.database.Cursor cursor = com.studio08.ronen.Zivug.ContactLab.get(getContext()).getWordMatches(query);
    if ((mCursorAdapter) == null)
        mCursorAdapter = new com.studio08.ronen.Zivug.ContactsRVCursorAdapter(getContext(), cursor);
    else
        mCursorAdapter.swapCursor(cursor);
    
    if ((mRecyclerView) != null)
        mRecyclerView.setAdapter(mCursorAdapter);
    
}