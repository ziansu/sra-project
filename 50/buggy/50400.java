public java.util.List<askme.ExerciseEntity> getExerciseList(int classId, int exercise_id) {
    exerciseList = exerciseSessionBean.getExercises(exercise_id);
    return exerciseList;
}