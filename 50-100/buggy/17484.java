public void setText(java.lang.String str) {
    mTextView.setText(str);
    mTextView.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener() {
        @java.lang.Override
        public boolean onPreDraw() {
            if (!(hasGetLineCount)) {
                hasMore = (mTextView.getLineCount()) > (showLine);
                hasGetLineCount = true;
            }
            mClickToShow.setVisibility((hasMore ? VISIBLE : GONE));
            mTextView.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
    });
}