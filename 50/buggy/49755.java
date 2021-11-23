public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL("DROP TABLE IF EXITS MONAN");
    db.execSQL("DROP TABLE IF EXITS QUANAN");
    db.execSQL("DROP TABLE IF EXISTS USER");
    onCreate(db);
}