@java.lang.Override
public void onClick(android.view.View v) {
    mCurrentIndex = ((mCurrentIndex) + 1) % (mQuestionBank.length);
    com.example.rahulchandrashekhar.geoquiz.HEAD mIsCheater = false;
    updateQuestion();
}