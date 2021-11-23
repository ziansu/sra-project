public void startRoundAction(android.view.MenuItem item) {
    mRound.startRound();
    setMenuView(item);
    mView.showRoundMessage(mContext.getString(R.string.result_round_started));
}