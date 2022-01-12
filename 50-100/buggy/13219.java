private void isSeen(net.ilexiconn.magister.container.Grade grade, android.database.sqlite.SQLiteDatabase db) {
    android.content.ContentValues contentValues = new android.content.ContentValues();
    contentValues.put(com.z3r0byte.magistify.DatabaseHelpers.NewGradesDB.KEY_DATE_ADDED, grade.filledInDateString);
    contentValues.put(com.z3r0byte.magistify.DatabaseHelpers.NewGradesDB.KEY_IS_SEEN, true);
    db.update(com.z3r0byte.magistify.DatabaseHelpers.NewGradesDB.TABLE_GRADES, contentValues, ((((com.z3r0byte.magistify.DatabaseHelpers.NewGradesDB.KEY_DATE_ADDED) + " = '") + (grade.filledInDateString)) + "'"), null);
    db.close();
}