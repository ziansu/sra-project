public long createCourseTable(coen390.nicholas.savedataapp.Course course) {
    android.database.sqlite.SQLiteDatabase db = this.getWritableDatabase();
    android.content.ContentValues values = new android.content.ContentValues();
    values.put(coen390.nicholas.savedataapp.databaseSQL.KEY_COURSE_ID, course.getCourseId());
    values.put(coen390.nicholas.savedataapp.databaseSQL.KEY_COURSE_TITLE, course.getCourseTitle());
    long course_id = db.insert(coen390.nicholas.savedataapp.databaseSQL.TABLE_COURSES, null, values);
    return course_id;
}