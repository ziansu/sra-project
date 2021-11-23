@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    android.util.Log.d("DatabaseConnector", "onCreate called");
    final java.lang.String createQueryTasks = "CREATE TABLE tasks" + (((("(_id integer primary key autoincrement, " + "category INT, ") + "info TEXT, ") + "reminders TEXT, ") + "deadline TEXT);");
    final java.lang.String createQueryCategories = "CREATE TABLE categories" + (("(_id integer primary key autoincrement, " + "category TEXT, ") + "repeats INT);");
    db.execSQL(createQueryTasks);
    db.execSQL(createQueryCategories);
    insertDefaultData(db);
}