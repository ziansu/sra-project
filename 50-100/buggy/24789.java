public void deleteTagMap(java.util.ArrayList<java.lang.Integer> tagIDs) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    for (int id : tagIDs) {
        db.delete(io.github.data4all.model.DataBaseHandler.TABLE_TAGMAP, ((io.github.data4all.model.DataBaseHandler.KEY_TAGID) + "=?"), new java.lang.String[]{ java.lang.String.valueOf(id) });
    }
    db.close();
}