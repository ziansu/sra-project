public void createNode(io.github.data4all.model.data.Node node) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(io.github.data4all.model.DataBaseHandler.KEY_OSMID, node.getOsmId());
    values.put(io.github.data4all.model.DataBaseHandler.KEY_LAT, node.getLat());
    values.put(io.github.data4all.model.DataBaseHandler.KEY_LON, node.getLon());
    db.insert(io.github.data4all.model.DataBaseHandler.TABLE_NODE, null, values);
    db.close();
}