public static android.database.sqlite.SQLiteDatabase createStage(android.database.sqlite.SQLiteDatabase db, int rows, int cols, boolean isLocked, long level, java.lang.String jsonStartGridSerialized) {
    db.insert(Stage.TABLE_NAME, null, new com.captainhampton.android.lightsout.model.Stage.Marshal().num_cols(cols).num_rows(rows).is_locked(isLocked).level(level).start_grid(jsonStartGridSerialized).asContentValues());
    return db;
}