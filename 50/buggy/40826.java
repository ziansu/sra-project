public java.lang.String getNextQuestion() {
    java.lang.String s = questionList[currentQuestion];
    (currentQuestion)++;
    return s;
}