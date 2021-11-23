@java.lang.Override
public void random(final org.foomla.androidapp.service.ExerciseService.Callback<org.foomla.androidapp.domain.Exercise> callback, boolean isPro) throws java.io.IOException {
    if (exercises.isEmpty()) {
        java.util.List<org.foomla.androidapp.domain.Exercise> collection = loadExercises(isPro);
        if (collection != null) {
            exercises.addAll(collection);
        }
    }
    if (!(exercises.isEmpty())) {
        int randomIndex = random.nextInt(((exercises.size()) - 1));
        callback.onResult(exercises.get(randomIndex));
    }
}