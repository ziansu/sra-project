private void checkButtonsAnswer(android.graphics.drawable.Drawable background) {
    java.lang.String askerDisplay = mAskerTextView.getText().toString();
    java.lang.String answer = getDrawableStringName(background);
    if (checkAnswers(answer, askerDisplay)) {
        setAsker();
        updateScore();
        mTimer.cancel();
        mTimer.start();
        shuffleTilesAndSetColor();
    }else {
        checkEmptyScore();
        getHighScore();
        startLostScreenActivity(mNewScore);
    }
}