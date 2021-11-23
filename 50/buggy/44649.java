@java.lang.Override
public void onUpgrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
    java.lang.String query = "";
    switch (newVersion) {
        case 3 :
            query = "ALTER TABLE Students ADD COLUMN photo_path TEXT";
            db.execSQL(query);
    }
}