public static boolean initDDBB(java.lang.String dbName, android.app.Activity activity) {
    boolean success = false;
    android.database.sqlite.SQLiteDatabase db = com.grupo5.cebancburger.ddbbrepo.DDBBSQLite.getDDBB(dbName, activity);
    if (db != null) {
        success = true;
        android.widget.Toast.makeText(activity.getApplicationContext(), "DDBB Created", Toast.LENGTH_SHORT).show();
        db.close();
    }
    return success;
}