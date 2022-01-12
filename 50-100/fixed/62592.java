@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    if (oldVersion < 3) {
        dropPreVersion3Tables(db);
        onCreate(db);
    }else
        if (oldVersion == 3) {
            createTeachersTable(db);
            createSubjectsTable(db);
            resetDatabase(db);
        }else {
            throwBecauseOldVersionNotHandled(oldVersion);
        }
    
}