@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    switch (oldVersion) {
        case 1 :
            removeTable(db, CreuRojaContract.Users.TABLE_NAME);
            createUsersTable(db);
        case 2 :
            removeTable(db, CreuRojaContract.Services.TABLE_NAME);
            removeTable(db, CreuRojaContract.Locations.TABLE_NAME);
            createLocationsTable(db);
            createServicesTable(db);
            createLocationServicesTable(db);
            break;
    }
}