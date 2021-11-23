@java.lang.Override
public void onClick(android.view.View view) {
    mCurrentIndex = (((mCurrentIndex) - 1) + (mQuestionBank.length)) % (mQuestionBank.length);
    updateQuestion();
}