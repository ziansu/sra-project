@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    if ((newVersion == 2) && (oldVersion == 1)) {
        db.execSQL("alter table COVERS add column COVERTYPE integer default '0'");
    }
}