public void OnSetIndicatorView(android.widget.ImageView mIndicatorView, int position) {
    if (null != (mIndicatorBackgroundDrawable))
        mIndicatorView.setBackgroundDrawable(mIndicatorBackgroundDrawable);
    
    if (null != (mIndicatorSrcDrawable)) {
        mIndicatorView.setImageDrawable(mIndicatorSrcDrawable);
    }
}