@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    for (com.labs.fi141.devicecare.db.Table table : tables.values()) {
        db.execSQL(table.getCREATE());
    }
}