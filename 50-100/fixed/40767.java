@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    android.util.Log.d("Database", "onCreate executed");
    db.execSQL((("DROP TABLE IF EXISTS " + (edu.cmu.sv.flight.rescheduler.database.sql.SQLCmdAirport.TABLE_NAME)) + ";"));
    db.execSQL(SQLCmdAirport.CREATE_TABLE);
    android.util.Log.d("Database", "Table created");
}