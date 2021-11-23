private void checkQuestionThreeAnswer() {
    java.lang.String name = getQuestionThreeUserInput();
    if (name.trim().equalsIgnoreCase("drake")) {
        correctAnswers += 1;
    }else {
        correctAnswers += 0;
    }
}