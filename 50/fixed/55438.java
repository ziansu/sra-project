@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase database) {
    database.execSQL(com.fyp.n3015509.db.MySQLiteHelper.CREATE_BOOK_TABLE);
    database.execSQL(com.fyp.n3015509.db.MySQLiteHelper.CREATE_AUTHOR_TABLE);
    database.execSQL(com.fyp.n3015509.db.MySQLiteHelper.CREATE_BUZZLIST_TABLE);
    database.execSQL(com.fyp.n3015509.db.MySQLiteHelper.CREATE_BOOK_INTERIM_TABLE);
    database.execSQL(com.fyp.n3015509.db.MySQLiteHelper.CREATE_BUZZLIST_INTERIM_TABLE);
}