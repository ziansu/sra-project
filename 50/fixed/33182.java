private void updateQuestion() {
    java.lang.String question = mQuestionBank[mCurrentIndex].getTextResId();
    mQuestionTextView.setText(question);
}