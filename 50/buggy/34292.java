private int checkUserAnswer(int questionNumber, int userAnswer) {
    ru.na_uglu.firstaidtests.testQuestion question = myDB.getQuestion(testName, questionNumber);
    if (question.answers[(userAnswer - 1)].isRight) {
        return 1;
    }else {
        return 0;
    }
}