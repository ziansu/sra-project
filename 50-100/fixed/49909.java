public java.util.List<org.exadel.training.service.Training> getWeeklyTrainings(long userId) {
    java.util.List<org.exadel.training.service.Training> weeklyTrainings = new java.util.ArrayList<>();
    java.util.List<org.exadel.training.service.Training> trainings = trainingService.getTrainingsByVisitor(userId);
    for (org.exadel.training.service.Training training : trainings) {
        if (training.isRegular()) {
            weeklyTrainings.add(training);
        }
    }
    return weeklyTrainings;
}