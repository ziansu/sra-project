@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    java.lang.String createQuery = "";
    for (com.labs.fi141.devicecare.db.Table table : tables.values()) {
        createQuery += table.getCREATE();
    }
    db.execSQL(createQuery);
}