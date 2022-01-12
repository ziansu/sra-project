public void initialize(android.database.sqlite.SQLiteDatabase database) {
    database.beginTransaction();
    java.util.ArrayList<edu.lclark.studentdatabaseapp.CSClass> classes = edu.lclark.studentdatabaseapp.CSClass.getAllClasses();
    for (edu.lclark.studentdatabaseapp.CSClass csClass : classes) {
        database.insert(CSClass.TABLE_NAME, null, csClass.getContentValues());
    }
    database.setTransactionSuccessful();
    database.endTransaction();
}