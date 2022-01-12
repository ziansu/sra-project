@java.lang.Override
public void list(final org.foomla.androidapp.service.ExerciseService.Callback<java.util.List<org.foomla.androidapp.domain.Exercise>> callback, final boolean isPro) throws java.io.IOException {
    java.util.List<org.foomla.androidapp.domain.Exercise> list = loadExercises(isPro);
    exercises.clear();
    exercises.addAll(list);
    callback.onResult(exercises);
}