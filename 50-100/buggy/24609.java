public void restoreDataFromDatabase() {
    android.database.Cursor cursor = getContext().getContentResolver().query(MovieContracts.MovieTable.CONTENT_URI, null, null, null, null);
    if ((cursor == null) || (!(cursor.moveToFirst()))) {
        android.widget.Toast.makeText(getContext(), "No data in local database, Please refresh!", Toast.LENGTH_SHORT).show();
    }else {
        adapter.swapCursor(cursor);
    }
}