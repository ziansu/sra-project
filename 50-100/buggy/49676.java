@java.lang.Override
public android.content.Loader<android.database.Cursor> onCreateLoader(int id, android.os.Bundle args) {
    java.util.Calendar calendar = java.util.Calendar.getInstance();
    int day = calendar.get(java.util.Calendar.DAY_OF_WEEK);
    android.net.Uri exerciseUri = WorkoutContract.ExerciseEntry.buildWorkoutIdDayOfWeek(mWorkoutId, day);
    return new android.content.CursorLoader(getActivity(), exerciseUri, null, null, null, null);
}