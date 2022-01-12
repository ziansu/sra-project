public void registerHistoryData(android.database.Cursor dataCursor) {
    if (dataCursor == null) {
        return ;
    }
    mTagList.clear();
    if (dataCursor.moveToFirst()) {
        do {
            java.lang.String book_name = dataCursor.getString(dataCursor.getColumnIndex(DB_Column.SearchHistory.BOOK_NAME));
            mTagList.add(book_name);
        } while (dataCursor.moveToNext() );
    }
    dataCursor.close();
    notifyDataSetChanged();
}