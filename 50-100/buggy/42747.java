@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(((((((((((((("create table " + (com.santinocampos.android.count.Database.ItemDbSchema.ItemTable.NAME)) + "(") + " _id integer primary key autoincrement, ") + (ItemTable.cols.NAME)) + " TEXT(255), ") + (ItemTable.cols.PRICE)) + " REAL(255), ") + (ItemTable.cols.ITEM_TYPE)) + "STRING(255), ") + (ItemTable.cols.COUNT)) + " INTEGER(255), ") + (ItemTable.cols.TOTAL_PRICE)) + " REAL(255));"));
}