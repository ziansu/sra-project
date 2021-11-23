public void decreaseBeerCount(android.view.View v) {
    if ((mBeerCount) != 0)
        (mBeerCount)--;
    
    mTotalBeersTextView.setText(getString(R.string.beers_had, mBeerCount));
    updateBAC();
}