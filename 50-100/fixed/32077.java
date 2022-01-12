public boolean contains(com.bk.fm.findmeeting.Person p) {
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    android.database.Cursor cursor = db.query(com.bk.fm.findmeeting.DataBase.TABLE_PEOPLE, new java.lang.String[]{ com.bk.fm.findmeeting.DataBase.PRIMARY_KEY }, ((com.bk.fm.findmeeting.DataBase.PRIMARY_KEY) + " = ?"), new java.lang.String[]{ p.getName() }, null, null, null, null);
    boolean results = cursor != null;
    db.close();
    return results;
}