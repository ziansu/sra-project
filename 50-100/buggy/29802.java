private void initViews() {
    for (int i = 0; i < (mIndicatorCount); ++i) {
        android.widget.ImageView mIndicatorView = new android.widget.ImageView(getContext());
        com.bobomee.android.drawableindicator.widget.LayoutParams params = new com.bobomee.android.drawableindicator.widget.LayoutParams(mIndicatorWidth, mIndicatorHeight);
        addView(mIndicatorView, params);
    }
    mMovingIndicatorView = new android.widget.ImageView(getContext());
    com.bobomee.android.drawableindicator.widget.LayoutParams params = new com.bobomee.android.drawableindicator.widget.LayoutParams(mIndicatorWidth, mIndicatorHeight);
    addView(mMovingIndicatorView, params);
}