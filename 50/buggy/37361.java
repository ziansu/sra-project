@java.lang.Override
protected boolean isAnswerCorrect() {
    return getQuiz().isAnswerCorrect(((java.lang.String) (mCurrentSelection.getText())));
}