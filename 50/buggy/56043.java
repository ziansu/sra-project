public void OnSetSelectedIndicatorView(android.widget.ImageView mSelectedIndicatorView) {
    if (null != (mMovingIndicatorBackgroundDrawable))
        mSelectedIndicatorView.setBackgroundDrawable(mMovingIndicatorBackgroundDrawable);
    
    if (null != (mMovingIndicatorSrcDrawable)) {
        mSelectedIndicatorView.setImageDrawable(mMovingIndicatorSrcDrawable);
    }
}