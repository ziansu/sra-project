public java.lang.String getNextQuestion() {
    java.lang.String s = questionList.get(currentQuestion);
    (currentQuestion)++;
    return s;
}