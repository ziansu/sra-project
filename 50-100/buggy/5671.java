@java.lang.Override
public void onCreate(android.database.sqlite.SQLiteDatabase db) {
    java.lang.String query = (((((("CREATE TABLE " + (exjobb.selfannotationsystem.Database.DBLabelHelper.TABLE_LABELS)) + "(") + (exjobb.selfannotationsystem.Database.DBLabelHelper.COLUMN_ID)) + " INTEGER PRIMARY KEY AUTOINCREMENT, ") + (exjobb.selfannotationsystem.Database.DBLabelHelper.COLUMN_VALUE)) + " TEXT ") + ");";
    db.execSQL(query);
    java.lang.String[] defaults = new java.lang.String[]{ "No label" , "Transportsträcka" , "Stressad aktivitet" , "Omedveten aktivitet" , "Jobbaktivitet" , "Skolgympa" };
    for (java.lang.String s : defaults) {
        addLabel(s);
    }
}