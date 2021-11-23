@java.lang.Override
public int calculatePercentageOfCorrectAnswers(java.util.List<pl.wp.quizwp.models.pojos.Answer> answers) {
    if ((answers == null) || (answers.isEmpty())) {
        return 0;
    }
    float totalAnswers = answers.size();
    float correctAnswers = 0;
    for (pl.wp.quizwp.models.pojos.Answer answer : answers) {
        if (answer.isCorrect()) {
            correctAnswers += 1;
        }
    }
    return java.lang.Math.round(((correctAnswers / totalAnswers) * 100));
}