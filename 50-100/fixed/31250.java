@java.lang.Override
public void openExerciseNewUser(int userId) {
    com.cranecoding.model.Exercise exercise = exerciseDAO.getExerciseById(1);
    com.cranecoding.model.Score score = new com.cranecoding.model.Score();
    score.setUser(userDAO.getUserById(userId));
    score.setExercise(exercise);
    score.setTime(0);
    score.setStatus(0);
    score.setBlock("");
    score.setStar(0);
    scoreDAO.save(score);
}