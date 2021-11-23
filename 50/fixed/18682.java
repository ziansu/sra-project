private void addNewSubWorkoutOnClick() {
    java.lang.String subWorkoutName = getSubWorkoutName();
    addSubWorkoutToDatatable(subWorkoutName);
    subWorkoutNames.add(subWorkoutName);
    if ((adapter) != null) {
        adapter.notifyDataSetChanged();
    }
    (SUBWORKOUT_DAY)++;
}