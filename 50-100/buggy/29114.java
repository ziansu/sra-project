@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    timber.log.Timber.d("DB - onUpgrade: %d -> %d", oldVersion, newVersion);
    if (oldVersion < 2) {
        dropDB(db);
        createDB(db);
    }
    if (oldVersion == 2) {
        upgradeToVersion3(db);
        oldVersion = 3;
    }
    if (oldVersion == 3) {
        upgradeToVersion4(db);
        oldVersion = 4;
    }
}