private void updateNextQuestionContent() {
    int index = ((mCurrentIndex) + 1) % (mQuestions.length);
    updateQuestionContent(index);
    mIsCheater = false;
}