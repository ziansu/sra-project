private void checkButtonsAnswer(android.view.View view) {
    java.lang.String askerDisplay = mAskerTextView.getText().toString();
    java.lang.String answer = getDrawableStringName(((android.widget.Button) (view)));
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