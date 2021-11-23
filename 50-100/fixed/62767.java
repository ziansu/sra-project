private void showDates() {
    allWorkoutDates = adapter.getAllWorkoutDates();
    startManagingCursor(allWorkoutDates);
    setListAdapter(new com.alexrothberg.afitness.LogActivity.WorkoutDateSummary(this, R.layout.workout_summary_list_item, allWorkoutDates, new java.lang.String[]{ android.provider.BaseColumns._ID , "exercise_count" , "activity_count" }, new int[]{ R.id.workout_summary_date_txt , R.id.workout_summary_exercises_txt , R.id.workout_summary_activities_txt }));
}