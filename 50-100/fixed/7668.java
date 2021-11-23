private void showExercises() {
    allEercises = adapter.getAlExerciseOn(selected_date_long);
    startManagingCursor(allEercises);
    setListAdapter(new android.widget.SimpleCursorAdapter(this, R.layout.workout_summary_exercises_list_item, allEercises, new java.lang.String[]{ com.alexrothberg.afitness.DbAdapter.Exercises.KEY_NAME , "activity_count" }, new int[]{ R.id.workout_summary_exercises_name_txt , R.id.workout_summary_exercises_activities_txt }));
}