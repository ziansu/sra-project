@java.lang.Override
public void onClick(android.view.View v) {
    mCurrentIndex = ((mCurrentIndex) - 1) % (mQuestionBank.length);
    mCurrentIndex = ((mCurrentIndex) < 0) ? (mQuestionBank.length) + (mCurrentIndex) : mCurrentIndex;
    updateQuestion(false);
}