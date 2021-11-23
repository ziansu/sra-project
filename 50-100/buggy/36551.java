@java.lang.Override
public void list(final org.foomla.androidapp.service.ExerciseService.Callback<java.util.List<org.foomla.androidapp.domain.Exercise>> callback, final boolean isPro) throws java.io.IOException {
    if (!(exercises.isEmpty())) {
        callback.onResult(exercises);
    }
    exercises.clear();
    java.util.List<org.foomla.androidapp.domain.Exercise> list = loadExercises(isPro);
    exercises.addAll(list);
    callback.onResult(exercises);
}