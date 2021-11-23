public void addAssociation() {
    android.database.sqlite.SQLiteDatabase db = getWritableDatabase();
    db.beginTransaction();
    try {
        android.content.ContentValues values = new android.content.ContentValues();
        values.put(xyz.smartsniff.SessionDatabaseHelper.KEY_ASSOCIATION_ID_SESSION_FK, sessionId);
        values.put(xyz.smartsniff.SessionDatabaseHelper.KEY_ASSOCIATION_ID_DEVICE_FK, deviceId);
        values.put(xyz.smartsniff.SessionDatabaseHelper.KEY_ASSOCIATION_ID_LOCATION_FK, locationId);
        db.insertOrThrow(xyz.smartsniff.SessionDatabaseHelper.TABLE_ASOCSESSIONSDEVICES, null, values);
        db.setTransactionSuccessful();
    } catch (android.database.SQLException e) {
    } finally {
        db.endTransaction();
    }
}