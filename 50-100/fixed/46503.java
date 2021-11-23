public void addNewExerciseSetToTraining(michalchojnacki.bodybuilder.diary.day.ExerciseSet exerciseSet, int trainingPartNumber, java.lang.String modifiedTraining) {
    for (michalchojnacki.bodybuilder.diary.day.Training training : mTrainings) {
        if (training.toString().equals(modifiedTraining)) {
            training.get(trainingPartNumber).add(exerciseSet);
            mTrainingsAdapter.notifyDataSetChanged();
            return ;
        }
    }
}