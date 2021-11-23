@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    nl.mprog.glimp.work_out.Workout workout = plannerAdapter.getItem(position);
    if ((workout.getExercises()) == null) {
        android.content.Intent intent = new android.content.Intent(getActivity(), nl.mprog.glimp.work_out.WorkoutActivity.class);
        intent.putExtra("workout", workout);
        startActivity(intent);
    }
}