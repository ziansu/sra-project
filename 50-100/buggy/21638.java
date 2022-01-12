@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    int upgradeTo = oldVersion + 1;
    while (upgradeTo <= newVersion) {
        switch (upgradeTo) {
            case 8 :
                db.execSQL(java.lang.String.format("UPDATE %s SET %s=%s*100;", DayPointsProviderMetadata.DayPointsTableMetadata.TABLE_NAME, DayPointsProviderMetadata.DayPointsTableMetadata.POINTS, DayPointsProviderMetadata.DayPointsTableMetadata.POINTS));
                break;
        }
    } 
    onCreate(db);
}