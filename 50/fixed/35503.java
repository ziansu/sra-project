public void handleMessage(android.os.Message msg) {
    mTime.setText(getTime());
    mScore.setText(getActivity().getString(R.string.score, mScoreValue));
    mGameView.update();
}