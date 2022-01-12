public void deletePolyElement(io.github.data4all.model.data.PolyElement polyElement) {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    db.delete(io.github.data4all.model.DataBaseHandler.TABLE_POLYELEMENT, ((io.github.data4all.model.DataBaseHandler.KEY_OSMID) + "=?"), new java.lang.String[]{ java.lang.String.valueOf(polyElement.getOsmId()) });
    for (io.github.data4all.model.data.Node node : polyElement.getNodes()) {
        deleteNode(node);
    }
    db.close();
}