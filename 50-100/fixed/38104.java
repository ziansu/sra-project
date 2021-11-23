public boolean workoutNameExist(java.lang.String workoutName) {
    open();
    boolean exists = false;
    java.lang.String query = ("select _id from workouts where name = '" + workoutName) + "'";
    android.database.Cursor cursor = db.rawQuery(query, null);
    if (cursor.moveToNext()) {
        exists = true;
    }
    cursor.close();
    close();
    return exists;
}