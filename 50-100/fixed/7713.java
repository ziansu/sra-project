@java.lang.Override
public int getUserAnswerIdByQuestionNumber(int number) {
    com.inquirer.models.Answer userAnswer = new com.inquirer.models.Answer();
    for (com.inquirer.models.Answer tmpAnswer : userAnswers) {
        if ((tmpAnswer.getQuestion()) == number) {
            userAnswer = tmpAnswer;
        }
    }
    if (userAnswer == null) {
        return 0;
    }else {
        return userAnswer.getId();
    }
}