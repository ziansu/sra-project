public org.ennen.kenshinn.motion5.models.Evaluacion insertEvaluacion(java.lang.String nombre, long materia, long rubrica, java.lang.String descripcion) {
    android.database.sqlite.SQLiteDatabase db = dbHelper.getWritableDatabase();
    android.content.ContentValues values = toContentValues(nombre, materia, rubrica, descripcion);
    long id = db.insert(getTableName(), null, values);
    db.close();
    return new org.ennen.kenshinn.motion5.models.Evaluacion(id, nombre, materia, rubrica, descripcion);
}