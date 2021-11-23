@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(edu.gatech.cs2340.willcode4money.shoppingwithfriends.databases.DatabaseStrings.ReportStrings.CREATE_TABLE);
}