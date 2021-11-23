@java.lang.Override
public void onClick(android.view.View view) {
    (mCurrentIndex)--;
    if ((mCurrentIndex) < 0) {
        mCurrentIndex = 0;
    }
    updateQuestion();
}