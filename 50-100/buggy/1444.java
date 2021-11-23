@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    java.lang.String TABEL = ((((((("CREATE TABLE IF not exists " + (cx.ath.laghaim.waxprivacy.DBHelper.CONTACTS_TABLE_NAME)) + " ") + "(") + "H_ROWS  integer,") + "H_DATA1 text,") + "H_PHONE   text,") + "STATUS  integer") + ");";
    db.execSQL(TABEL);
    TABEL = "CREATE TABLE IF not exists H_ROWS ( H_ROWS INTEGER NOT NULL UNIQUE);";
    db.execSQL(TABEL);
    TABEL = "CREATE TABLE IF not exists H_DATA1 ( H_DATA1 text NOT NULL UNIQUE);";
    db.execSQL(TABEL);
    TABEL = "CREATE TABLE IF not exists H_PHONE ( H_PHONE text NOT NULL UNIQUE);";
    db.execSQL(TABEL);
}