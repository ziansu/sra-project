public android.os.Handler getHandler() {
    if ((com.kit10.csci448.catastrophe.GameFragment.mHandler) == null) {
        com.kit10.csci448.catastrophe.GameFragment.mHandler = new android.os.Handler() {
            public void handleMessage(android.os.Message msg) {
                mTime.setText(getTime());
                mScore.setText(getString(R.string.score, mScoreValue));
                mGameView.update();
            }
        };
    }
    return com.kit10.csci448.catastrophe.GameFragment.mHandler;
}