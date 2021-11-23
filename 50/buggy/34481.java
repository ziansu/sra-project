public void onStartClicked(android.view.View v) {
    long workoutID = dbHelper.insertWorkoutEntry(mCurrWorkout);
    android.content.Intent i = new android.content.Intent(this, edu.dartmouth.cs.project.sixpk.WorkoutActivity.class);
    i.putExtra(Globals.WORKOUT_ID_KEY, workoutID);
    startActivity(i);
}