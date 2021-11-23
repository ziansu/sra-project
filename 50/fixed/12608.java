@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase sqLiteDatabase) {
    sqLiteDatabase.execSQL(UserModel.UserNames.CREATE_TABLE);
    sqLiteDatabase.execSQL(TripModel.TripNames.CREATE_TABLE);
    sqLiteDatabase.execSQL(AccDataModel.AccDataNames.CREATE_TABLE);
    sqLiteDatabase.execSQL(GpsDataModel.GpsDataNames.CREATE_TABLE);
    sqLiteDatabase.execSQL(TripDataView.TripDataNames.CREATE_TABLE);
}