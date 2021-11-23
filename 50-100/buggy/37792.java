private void startRound(int level) {
    mGameViews.clear();
    mGameViews.add(mEquationView);
    for (android.widget.Button button : mButtons) {
        button.setOnClickListener(guessButton);
        mGameViews.add(button);
    }
    resetStats(false);
    clearTimers();
    hideViews();
    mEquation = new com.jeremybowyer.mathtap.model.Equation(level);
    mEquationView.setText(mEquation.getEquation());
    mButtonsToRemove = setButtons(mButtons, mEquation);
    countdownClock.start();
}