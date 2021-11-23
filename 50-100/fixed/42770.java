public void createCourseTable(coen390.nicholas.savedataapp.Course course) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(coen390.nicholas.savedataapp.databaseSQL.KEY_COURSE_ID, course.getCourseId());
    values.put(coen390.nicholas.savedataapp.databaseSQL.KEY_COURSE_TITLE, course.getCourseTitle());
    db.insert(coen390.nicholas.savedataapp.databaseSQL.TABLE_COURSES, null, values);
}