@java.lang.Override
public int calculatePercentageOfCorrectAnswers(java.util.List<pl.wp.quizwp.models.pojos.Answer> answers) {
    if ((answers == null) || (answers.isEmpty())) {
        return 0;
    }
    int totalAnswers = answers.size();
    int correctAnswers = 0;
    for (pl.wp.quizwp.models.pojos.Answer answer : answers) {
        if (answer.isCorrect()) {
            ++correctAnswers;
        }
    }
    return java.lang.Math.round(((((float) (correctAnswers)) / ((float) (totalAnswers))) * 100));
}