@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase sqLiteDatabase) {
    if (!(this.isDatabaseExists())) {
        this.getReadableDatabase();
        this.close();
    }
}