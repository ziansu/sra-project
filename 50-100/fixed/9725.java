private void createPeriodTable(android.database.sqlite.SQLiteDatabase sqLiteDatabase) {
    sqLiteDatabase.execSQL((((((((((("CREATE TABLE " + (TABLE_PERIOD)) + "(") + (PERIOD_COLUMN_ID)) + " INTEGER PRIMARY KEY NOT NULL, ") + (PERIOD_COLUMN_SCHOOL_HOUR_NO)) + "INTEGER NOT NULL, ") + (PERIOD_COLUMN_STARTTIME)) + " TIME NOT NULL, ") + (PERIOD_COLUMN_ENDTIME)) + " TIME NOT NULL )"));
}