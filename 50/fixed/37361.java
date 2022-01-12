@java.lang.Override
protected boolean isAnswerCorrect() {
    return getQuiz().isAnswerCorrect(mCurrentSelection.getText().toString());
}