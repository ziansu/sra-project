public void finalizar(java.lang.Integer idTarea) {
    android.content.ContentValues valores = new android.content.ContentValues();
    valores.put(ProyectoDBMetadata.TablaTareasMetadata.FINALIZADA, 1);
    android.database.sqlite.SQLiteDatabase mydb = dbHelper.getWritableDatabase();
    mydb.update(ProyectoDBMetadata.TABLA_TAREAS, valores, "_id=?", new java.lang.String[]{ idTarea.toString() });
}