public void deleteItem(java.lang.String uid) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    uid = ("'" + uid) + "'";
    db.delete(helper.SQLiteHandlerItem.TABLE, (((helper.SQLiteHandlerItem.KEY_UID) + "=") + uid), null);
    db.close();
}