java.util.ArrayList<ru.na_uglu.planchecker.Project> getProjects() {
    java.util.ArrayList<ru.na_uglu.planchecker.Project> projects = new java.util.ArrayList<>();
    android.database.Cursor cursor = db.rawQuery("SELECT * FROM projects WHERE done = 0", null);
    cursor.moveToFirst();
    while (!(cursor.isAfterLast())) {
        projects.add(getProjectFromCursor(cursor, false));
        cursor.moveToNext();
    } 
    cursor.close();
    return projects;
}