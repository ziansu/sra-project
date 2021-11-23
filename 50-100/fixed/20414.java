@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    android.util.Log.d(cz.uhk.fim.mygeoalarm.DestinationDatabaseHelper.TAG, "Deleting database");
    db.execSQL(cz.uhk.fim.mygeoalarm.DestinationDatabaseHelper.SQL_DROP_DESTINATION_TABLE);
    android.util.Log.d(cz.uhk.fim.mygeoalarm.DestinationDatabaseHelper.TAG, "Creating database");
    db.execSQL(cz.uhk.fim.mygeoalarm.DestinationDatabaseHelper.SQL_CREATE_DESTINATION_TABLE);
    fillDatabase(db);
}