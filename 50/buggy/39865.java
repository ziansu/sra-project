public boolean remove(int id) {
    android.database.sqlite.SQLiteDatabase db2 = urlHistory.getWritableDatabase();
    return (db2.delete(com.example.koti.androidbrowser.HistoryAdapter2.UrlHistory.TABLE_NAME, (((com.example.koti.androidbrowser.HistoryAdapter2.UrlHistory.ID) + " = ") + id), null)) > 0;
}