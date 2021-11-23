@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    switch (oldVersion) {
        default :
            removeTable(db, CreuRojaContract.Users.TABLE_NAME);
            removeTable(db, CreuRojaContract.Services.TABLE_NAME);
            removeTable(db, CreuRojaContract.Locations.TABLE_NAME);
            createUsersTable(db);
            createLocationsTable(db);
            createServicesTable(db);
            createLocationServicesTable(db);
    }
}