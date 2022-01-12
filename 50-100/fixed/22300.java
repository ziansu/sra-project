@java.lang.Override
public void onNextTurnReset() {
    if (checkIfLivesLeft()) {
        if ((checkIfLastTurn()) == (LAST_TURN_RESET_BEFORE_NEW_ACTIVITY)) {
            launchFadeCounterActivity();
        }else {
            isStartClickable = true;
            resetTimeValuesBetweenTurns();
            gameInfoDisplayer.showButtonState(com.paceraudio.numberreactor.app.activities.CounterActivity.stopButton, stopButtonDisengaged);
        }
    }else {
        launchOutOfLivesDialog();
    }
}