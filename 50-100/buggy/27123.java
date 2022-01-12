@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    android.util.Log.d(heartware.com.heartware_master.WorkoutsActivity.TAG, "in onItemSelected listener");
    tvExercise = ((android.widget.TextView) (view.findViewById(R.id.tvExercise)));
    java.lang.String exerciseName = tvExercise.getText().toString();
    android.content.Intent intent = new android.content.Intent(getApplication(), heartware.com.heartware_master.ViewWorkout.class);
    intent.putExtra(DBAdapter.PROFILE_ID, mCurrentProfileId);
    intent.putExtra(DBAdapter.EXERCISE, exerciseName);
    startActivityForResult(intent, 1);
}