public void getHandler() {
    com.kit10.csci448.catastrophe.GameFragment.mHandler = new android.os.Handler() {
        public void handleMessage(android.os.Message msg) {
            mTime.setText(getTime());
            mScore.setText(getActivity().getString(R.string.score, mScoreValue));
            mGameView.update();
        }
    };
}