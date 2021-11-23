@java.lang.Override
public void onBindViewHolder(com.spiewak.workoutlogger.adapters.SetAdapter.SetHolder holder, int position) {
    com.spiewak.workoutlogger.models.WorkoutSet workoutSet = workoutSets.get(position);
    java.lang.String setAndReps = ((java.lang.Integer.toString(workoutSet.getReps())) + "x") + (java.lang.Double.toString(workoutSet.getLoad()));
    holder.workoutSet.setText(setAndReps);
    android.util.Log.d("WORKOUT", setAndReps);
}