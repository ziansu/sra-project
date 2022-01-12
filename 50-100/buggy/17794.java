public void searchContacts(java.lang.String query) {
    android.database.Cursor cursor = com.studio08.ronen.Zivug.ContactLab.get(getContext()).getWordMatches(query, null);
    if ((mCursorAdapter) == null) {
        mCursorAdapter = new com.studio08.ronen.Zivug.ContactsRVCursorAdapter(getContext(), cursor);
        mRecyclerView.setAdapter(mCursorAdapter);
    }else {
        mCursorAdapter.swapCursor(cursor);
    }
}