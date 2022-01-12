public boolean addData(java.lang.String title, java.lang.String url) {
    db = this.getWritableDatabase();
    android.content.ContentValues contentValues = new android.content.ContentValues();
    contentValues.put(me.zeerooo.materialfb.Bookmarks.DatabaseHelper.COL2, title);
    contentValues.put(me.zeerooo.materialfb.Bookmarks.DatabaseHelper.COL3, url);
    long result = db.insert(me.zeerooo.materialfb.Bookmarks.DatabaseHelper.TABLE_NAME, null, contentValues);
    if (result == (-1)) {
        return false;
    }else {
        return true;
    }
}