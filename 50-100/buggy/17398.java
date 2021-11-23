public int deleteWorkout(java.lang.Integer Workout_ID) {
    java.lang.String[] args = new java.lang.String[]{ Workout_ID.toString() };
    int nor = workoutDatabase.delete(DatabaseSchema.DataBaseTerms.WORKOUTS_TABLE_NAME, DatabaseSchema.DELETE_WORKOUT_ROW_WHERE_CLAUSE, args);
    if (nor == 0) {
        throw new android.database.sqlite.SQLiteException("No workout with specified ID");
    }
    nor = workoutDatabase.delete(DatabaseSchema.DataBaseTerms.WORKOUTS_TABLE_NAME, DatabaseSchema.DELETE_WORKOUT_REL_ROWS_WHERE_CLAUSE, args);
    if (nor == 0) {
        throw new android.database.sqlite.SQLiteException("No workout rels with specified ID");
    }
    return nor;
}