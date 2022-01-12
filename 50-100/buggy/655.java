private void updateUI() {
    if (mIsWorking) {
        mStartStopWorkButton.setText(getResources().getString(R.string.leave_work));
    }else {
        mStartStopWorkButton.setText(getResources().getString(R.string.come_to_work));
    }
    if (!(mIsOnBreak)) {
        mBreakStartStopButton.setText(getResources().getString(R.string.end_break));
    }else {
        mBreakStartStopButton.setText(getResources().getString(R.string.start_break));
    }
}