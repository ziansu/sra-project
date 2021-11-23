private void setCheatToken() {
    if ((mCheatCount) <= 0) {
        mCheatButton.setVisibility(View.INVISIBLE);
    }else {
        mCheatButton.setVisibility(View.VISIBLE);
    }
    mCheatTokenTextView.setText(("Cheat Tokens Left " + (java.lang.Integer.toString(mCheatCount))));
}