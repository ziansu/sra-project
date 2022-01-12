public boolean isNoWeight() {
    final cc.ethon.logmaker.Exercise.ExerciseType type = set.getExercise().getType();
    if ((type != (cc.ethon.logmaker.Exercise.ExerciseType.WeightReps)) && (type != (cc.ethon.logmaker.Exercise.ExerciseType.WeightTime))) {
        return true;
    }
    return (set.getWeight()) == 0.0;
}