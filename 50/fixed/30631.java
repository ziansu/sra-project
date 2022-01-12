@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase sqLiteDatabase) {
    sqLiteDatabase.execSQL(SqlContacts.STATEMENT_CREATE_TABLE_USERS);
    sqLiteDatabase.execSQL(SqlContacts.STATEMENT_CREATE_TABLE_INSULIN_DOSE);
}