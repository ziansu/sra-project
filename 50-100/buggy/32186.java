public void createTagMap(java.util.Map<io.github.data4all.model.data.Tag, java.lang.String> tagMap) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    for (java.util.Map.Entry<io.github.data4all.model.data.Tag, java.lang.String> tag : tagMap.entrySet()) {
        values.put(io.github.data4all.model.DataBaseHandler.KEY_TAGID, tag.getKey().getId());
        values.put(io.github.data4all.model.DataBaseHandler.KEY_VALUE, tag.getValue());
        db.insert(io.github.data4all.model.DataBaseHandler.TABLE_TAGMAP, null, values);
    }
    db.close();
}