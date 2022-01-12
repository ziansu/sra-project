private void updateQuestionIndex(int value) {
    if ((currentIndex) == 0) {
        currentIndex = (questionList.length) - 1;
    }else {
        currentIndex = ((currentIndex) + value) % (questionList.length);
    }
    isCheater = false;
    setQuestionText();
}