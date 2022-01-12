private void initializeExerciseArray() {
    java.lang.String exerciseSequence = mDbHelper.getExerciseSequence(workoutName);
    java.util.StringTokenizer st = new java.util.StringTokenizer(exerciseSequence, ",");
    while (st.hasMoreTokens()) {
        java.lang.Long exerciseId = java.lang.Long.parseLong(st.nextToken());
        com.cwru.model.Exercise exercise = mDbHelper.getExerciseFromId(exerciseId);
        exerciseList.add(exercise);
    } 
}