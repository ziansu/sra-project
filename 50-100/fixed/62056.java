private void showNextPilot() {
    if ((mNextPilot.position) != null) {
        int round = mArrRounds.get(mNextPilot.position);
        mPilotDialogShown = showPilotDialog(round, mNextPilot.id, mNextPilot.number);
    }else {
        showNextRound();
    }
}