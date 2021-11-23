@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int i, int i1) {
    db.execSQL(TblClients.SQL_DROP_TABLE);
    db.execSQL(TblStatus.SQL_DROP_TABLE);
    db.execSQL(TblMyDebts.SQL_DROP_TABLE);
    db.execSQL(TblWhoOwesMe.SQL_DROP_TABLE);
    db.execSQL(TblClients.SQL_CREATE_TABEL);
    db.execSQL(TblStatus.SQL_CREATE_TABEL);
    db.execSQL(TblMyDebts.SQL_CREATE_TABLE);
    db.execSQL(TblWhoOwesMe.SQL_CREATE_TABLE);
}