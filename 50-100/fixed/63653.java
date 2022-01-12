@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(((((((((((((("create table " + (CrimeDbSchema.CrimeTable.NAME)) + "(") + " _id integer primary key autoincrement, ") + (CrimeDbSchema.CrimeTable.Cols.UUID)) + ", ") + (CrimeDbSchema.CrimeTable.Cols.TITLE)) + ", ") + (CrimeDbSchema.CrimeTable.Cols.DATE)) + ", ") + (CrimeDbSchema.CrimeTable.Cols.SOLVED)) + ", ") + (CrimeDbSchema.CrimeTable.Cols.SUSPECT)) + ")"));
}