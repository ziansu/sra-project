@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    android.util.Log.d("NotesFragment", ("Submitted query" + query));
    java.lang.String searchQuery = ((((("SELECT *  FROM " + (HandbookContract.NotificationEntry.TABLE_NAME)) + " where ") + (HandbookContract.NotificationEntry.COLUMN_DETAIL)) + " like \'%") + query) + "%\'";
    cursor = db.rawQuery(searchQuery, null);
    mRecyclerView.setAdapter(mAdapter);
    searchView.clearFocus();
    return true;
}