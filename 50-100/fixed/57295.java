@java.lang.Override
public void onStart() {
    super.onStart();
    android.view.View view = getView();
    if (view != null) {
        android.widget.TextView title = ((android.widget.TextView) (view.findViewById(R.id.textTitle)));
        ua.kyselov.android.workout.Workout workout = Workout.workouts[((int) (workoutId))];
        title.setText(workout.getName());
        android.widget.TextView description = ((android.widget.TextView) (view.findViewById(R.id.textDescription)));
        description.setText(workout.getDescription());
    }
}