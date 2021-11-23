@java.lang.Override
protected void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    mGame.setBoardState(savedInstanceState.getCharArray("board"));
    rebuildBoard(savedInstanceState.getCharArray("board"));
    mGameOver = savedInstanceState.getBoolean("mGameOver");
    mInfoTextView.setText(savedInstanceState.getCharSequence("info"));
    mFirstMove = savedInstanceState.getBoolean("mFirstMove");
    mTurnPlayer = savedInstanceState.getBoolean("mTurnPlayer");
    if ((mTurnPlayer) == false) {
        computerPause();
    }
}