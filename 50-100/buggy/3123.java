public void dateQuery(android.database.Cursor cursor) {
    adapter.clear();
    list.clear();
    while (cursor.moveToNext()) {
        java.lang.String f = cursor.getString(cursor.getColumnIndex(DBContract.FeedEntry.COLUMN_FILE));
        list.add(f);
        android.util.Log.v("THE DATE", ("" + (cursor.getString(cursor.getColumnIndex(DBContract.FeedEntry.COLUMN_DATES)))));
        gridView.setAdapter(adapter);
    } 
    adapter.notifyDataSetChanged();
}