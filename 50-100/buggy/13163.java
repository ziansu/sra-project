public java.util.ArrayList<com.lerenard.bible.Ribbon> getAllRibbons() {
    java.util.ArrayList<com.lerenard.bible.Ribbon> res = new java.util.ArrayList<>();
    android.database.sqlite.SQLiteDatabase db = getReadableDatabase();
    android.database.Cursor cursor = getCursor(db);
    if (cursor.moveToFirst()) {
        do {
            res.add(getRibbon(cursor));
        } while (cursor.moveToNext() );
    }
    cursor.close();
    db.close();
    return res;
}