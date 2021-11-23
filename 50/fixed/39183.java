@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    db.execSQL(it.rieger.happyhour.controller.database.DatabaseHelper.CREATE_TABLEFACEBOOK_LOGIN);
    db.execSQL(it.rieger.happyhour.controller.database.DatabaseHelper.CREATE_TABLE_FAVORITE_LOCATIONS);
}