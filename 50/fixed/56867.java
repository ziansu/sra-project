@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(org.secuso.privacyfriendlyweather.database.PFASQLiteHelper.CREATE_TABLE_CITIES);
    db.execSQL(org.secuso.privacyfriendlyweather.database.PFASQLiteHelper.CREATE_TABLE_FORECASTS);
    db.execSQL(org.secuso.privacyfriendlyweather.database.PFASQLiteHelper.CREATE_CURRENT_WEATHER);
    db.execSQL(org.secuso.privacyfriendlyweather.database.PFASQLiteHelper.CREATE_TABLE_CITIES_TO_WATCH);
    fillCityDatabase(db);
}