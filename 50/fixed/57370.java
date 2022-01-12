@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(("create table clipboard " + "(id integer primary key autoincrement not null, cliptext text,starred boolean default 0,timestamp default current_timestamp not null)"));
}