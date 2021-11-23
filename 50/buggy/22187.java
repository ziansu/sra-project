@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    if (db.isReadOnly()) {
        db = getWritableDatabase();
    }
    createLocationsTable(db);
    createServicesTable(db);
    createVehiclesTable(db);
    createUsersTable(db);
    createLocationServicesTable(db);
}