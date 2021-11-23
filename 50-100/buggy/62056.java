private void showNextPilot() {
    android.util.Log.d("SHOW NEXT PILOT", "DIALOG");
    if ((mNextPilot.position) != null) {
        android.util.Log.d("SHOW NEXT PILOT", ("POSITON: " + (mNextPilot.position)));
        int round = mArrRounds.get(mNextPilot.position);
        mPilotDialogShown = showPilotDialog(round, mNextPilot.id, mNextPilot.number);
    }else {
        showNextRound();
    }
}