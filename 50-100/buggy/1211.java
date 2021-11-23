private void initialize() {
    mPaint = new android.text.TextPaint(getPaint());
    mMaxTextSize = getTextSize();
    mAvailableSpaceRect = new android.graphics.RectF();
    mTextCachedSizes = new android.util.SparseIntArray();
    if ((mMaxLines) == 0) {
        mMaxLines = com.q20.projectsummer.ui.AutoResizeTextViewWithAfsanehFont.NO_LINE_LIMIT;
    }
    if (!(isInEditMode())) {
        android.graphics.Typeface tf = android.graphics.Typeface.createFromAsset(getContext().getAssets(), "afsaneh.ttf");
        setTypeface(tf);
    }
}