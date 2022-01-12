public void OnSetSelectedIndicatorView(@android.support.annotation.NonNull
android.widget.ImageView mSelectedIndicatorView) {
    if (null != (mMovingIndicatorBackgroundDrawable)) {
        mSelectedIndicatorView.setBackgroundDrawable(mMovingIndicatorBackgroundDrawable);
    }
    if (null != (mMovingIndicatorSrcDrawable)) {
        mSelectedIndicatorView.setImageDrawable(mMovingIndicatorSrcDrawable);
    }
}