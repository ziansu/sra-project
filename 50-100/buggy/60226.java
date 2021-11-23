public void addLabel(app.sourabhlal.filter.Label label) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.content.ContentValues v = new android.content.ContentValues();
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.content.ContentValues v = new android.content.ContentValues();
    v.put(app.sourabhlal.filter.DBHelper.col_labelID, label.getName());
    db.insert(app.sourabhlal.filter.DBHelper.Table_Labels, null, v);
    db.close();
}