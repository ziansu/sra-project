private static java.util.Map<java.lang.String, java.lang.Object> getStrengthWorkout(final java.lang.String workoutName, final java.lang.String exerciseName1, final java.lang.String exerciseName2) {
    return new java.util.HashMap<java.lang.String, java.lang.Object>() {
        {
            put(SharedPreferencesHelper.NAME, workoutName);
            put(SharedPreferencesHelper.EXERCISES, new java.util.ArrayList<java.lang.Object>() {
                {
                    add(com.aff.allformfitness.defaults.ProgramsDefaults.getStrengthExercise(exerciseName1, "3"));
                    add(com.aff.allformfitness.defaults.ProgramsDefaults.getStrengthExercise(exerciseName2, "3"));
                }
            });
        }
    };
}