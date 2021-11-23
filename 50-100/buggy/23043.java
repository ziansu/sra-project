private void setUiText() {
    int i = 0;
    streakCounterTextView.setText(java.lang.String.valueOf(com.smart.InGame.rightAnswersCounter));
    questionTextView.setText(com.smart.InGame.question.getQuestionTitle());
    java.util.ArrayList<java.lang.String> answerList = com.smart.InGame.question.getAnswerList();
    for (android.widget.Button button : answerButtonsList) {
        button.setText(answerList.get(i));
        i++;
        resultProgressBar.setProgress(com.smart.InGame.rightAnswersCounter);
        button.setEnabled(true);
    }
}