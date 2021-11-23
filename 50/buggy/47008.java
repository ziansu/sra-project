private void checkIfFinished() {
    if ((mScore) == 0) {
        createGameOver(false);
    }
    if ((mNumberOfQuestions) >= (MAX_QUESTIONS)) {
        createGameOver(true);
    }
}