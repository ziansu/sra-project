private void updateQuestionIndex(int value) {
    currentIndex = ((currentIndex) + value) % (questionList.length);
    if ((currentIndex) < 0) {
        currentIndex = (questionList.length) - 1;
    }
    isCheater = false;
    setQuestionText();
}