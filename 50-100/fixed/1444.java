@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    java.lang.String TABEL = ((((((("CREATE TABLE IF not exists " + (cx.ath.laghaim.waxprivacy.DBHelper.CONTACTS_TABLE_NAME)) + " ") + "(") + "H_ROWS  integer,") + "H_DATA1 text,") + "H_PHONE   text,") + "STATUS  integer") + ");";
    db.execSQL(TABEL);
}