private void addSubWorkoutToDatatable(java.lang.String subWorkoutName) {
    com.example.kaveon14.workoutbuddy.DataBase.TableManagers.SubWorkoutTable subWorkoutTable = new com.example.kaveon14.workoutbuddy.DataBase.TableManagers.SubWorkoutTable(context);
    subWorkoutTable.addSubWorkoutTable(subWorkoutName);
    com.example.kaveon14.workoutbuddy.DataBase.TableManagers.MainWorkoutTable mainWorkoutTable = new com.example.kaveon14.workoutbuddy.DataBase.TableManagers.MainWorkoutTable(context);
    mainWorkoutTable.addSubWorkout(MainWorkoutFragment.clickedMainWorkout, subWorkoutName, SUBWORKOUT_DAY);
}