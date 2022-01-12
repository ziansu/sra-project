@java.lang.Override
public com.delect.motiver.shared.ExerciseModel updateExercise(com.delect.motiver.shared.ExerciseModel exercise) throws com.delect.motiver.shared.exception.ConnectionException {
    com.delect.motiver.shared.ExerciseModel m = null;
    final com.delect.motiver.server.jdo.UserOpenid user = userManager.getUser(this.perThreadRequest);
    com.delect.motiver.server.manager.TrainingManager trainingManager = com.delect.motiver.server.manager.TrainingManager.getInstance();
    com.delect.motiver.server.jdo.training.Exercise jdo = com.delect.motiver.server.jdo.training.Exercise.getServerModel(exercise);
    trainingManager.addExercise(user, jdo, exercise.getWorkoutId());
    m = com.delect.motiver.server.jdo.training.Exercise.getClientModel(jdo);
    return m;
}