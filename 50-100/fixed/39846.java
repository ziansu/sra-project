@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(((((((((("create table " + (NotificationTable.NAME)) + "(") + " _id integer primary key autoincrement, ") + (NotificationTable.Column.DATE)) + ", ") + (NotificationTable.Column.TITLE)) + ", ") + (NotificationTable.Column.BODY)) + ")"));
}