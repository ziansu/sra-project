private void setCheatToken() {
    if (mIsCheater) {
        (mCheatCount)--;
    }
    if ((mCheatCount) >= 3) {
        mCheatButton.setVisibility(View.INVISIBLE);
    }else {
        mCheatButton.setVisibility(View.VISIBLE);
    }
    mCheatTokenTextView.setText(("Cheat Tokens Left " + (java.lang.Integer.toString(mCheatCount))));
}