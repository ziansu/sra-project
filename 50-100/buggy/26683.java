private boolean deleteAssignment(int assignID, android.database.sqlite.SQLiteDatabase db) {
    java.lang.String whereClause = (com.alexpavel.simpleassignmentplanner.CourseDBHelper.LINK_ASSIGN_ID) + "=?";
    java.lang.String[] whereArgs = new java.lang.String[]{ java.lang.String.valueOf(assignID) };
    db.delete(com.alexpavel.simpleassignmentplanner.CourseDBHelper.LINK_TABLE_NAME, whereClause, whereArgs);
    whereClause = (com.alexpavel.simpleassignmentplanner.CourseDBHelper.ASSIGN_COLUMN_ID) + "=?";
    whereArgs = new java.lang.String[]{ java.lang.String.valueOf(assignID) };
    db.delete(com.alexpavel.simpleassignmentplanner.CourseDBHelper.ASSIGN_TABLE_NAME, whereClause, whereArgs);
    db.close();
    return true;
}