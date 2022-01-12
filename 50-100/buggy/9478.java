public void deleteAllPolyElements() {
    final android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    java.util.List<io.github.data4all.model.data.PolyElement> pEs = getAllPolyElements();
    for (io.github.data4all.model.data.PolyElement pE : pEs) {
        for (io.github.data4all.model.data.Node n : pE.getNodes()) {
            deleteNodeByID(n.getOsmId());
        }
    }
    db.delete(io.github.data4all.handler.DataBaseHandler.TABLE_POLYELEMENT, null, null);
}