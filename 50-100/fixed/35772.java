private void update() {
    mDecrease.setEnabled(((mNumber) >= 1));
    if ((mMax) == null) {
        mCount.setText(mNumberFormat.format(mNumber));
        mIncrease.setEnabled(true);
    }else {
        mCount.setText(getResources().getString(R.string.progress_format, mNumberFormat.format(mNumber), mNumberFormat.format(mMax)));
        mIncrease.setEnabled(((mNumber) < (mMax)));
    }
}