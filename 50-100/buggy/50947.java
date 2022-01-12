@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL(("DROP TABLE IF EXISTS " + (io.github.data4all.model.DataBaseHandler.TABLE_USER)));
    db.execSQL(("DROP TABLE IF EXISTS " + (io.github.data4all.model.DataBaseHandler.TABLE_TAGMAP)));
    db.execSQL(("DROP TABLE IF EXISTS " + (io.github.data4all.model.DataBaseHandler.TABLE_WAY)));
    db.execSQL(("DROP TABLE IF EXISTS " + (io.github.data4all.model.DataBaseHandler.TABLE_NODE)));
    db.execSQL(("DROP TABLE IF EXISTS " + (io.github.data4all.model.DataBaseHandler.TABLE_DATAELEMENT)));
    db.execSQL(("DROP TABLE IF EXISTS " + (io.github.data4all.model.DataBaseHandler.TABLE_POLYELEMENT)));
    onCreate(db);
}