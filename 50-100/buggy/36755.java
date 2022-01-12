@java.lang.Override
public void onClick(android.view.View v) {
    if ((mCurrentQuestion) < ((mQuestions.length) - 1)) {
        (mCurrentQuestion)++;
    }else {
        mNextButton.setText(getString(R.string.no_more_questions));
        mNextButton.setTextColor(Color.GRAY);
        mNextButton.setClickable(false);
    }
    showCurrentQuestion();
}