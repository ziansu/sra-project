private void deletePolyElementByID(long id) {
    final android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    io.github.data4all.model.data.PolyElement pE = getPolyElement(id);
    for (io.github.data4all.model.data.Node n : pE.getNodes()) {
        deleteNodeByID(n.getOsmId());
    }
    db.delete(io.github.data4all.handler.DataBaseHandler.TABLE_POLYELEMENT, ((io.github.data4all.handler.DataBaseHandler.KEY_OSMID) + "=?"), new java.lang.String[]{ java.lang.String.valueOf(id) });
}