public com.computing.pervasive.myapplication.Building getBuilding(int id) {
    com.computing.pervasive.myapplication.Building building = null;
    android.database.sqlite.SQLiteDatabase db = this.getReadableDatabase();
    android.database.Cursor cursor = db.query(com.computing.pervasive.myapplication.MyDBHandler.TABLE_BUILDING, null, (((com.computing.pervasive.myapplication.MyDBHandler.COLUMN_BUILDING_ID) + " = ") + id), null, null, null, null);
    if (cursor.moveToFirst()) {
        building = new com.computing.pervasive.myapplication.Building(cursor.getInt(0), cursor.getString(1));
    }
    db.close();
    return building;
}