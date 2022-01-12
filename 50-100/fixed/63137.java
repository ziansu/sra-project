private void setupViews(android.util.AttributeSet attrs) {
    if (attrs != null) {
        applyXmlAttributes(attrs);
    }
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.JELLY_BEAN)) {
        setBackground(mBackgroundDrawable);
    }else {
        setBackgroundDrawable(mBackgroundDrawable);
    }
    setupQueryBar();
    if (!(isInEditMode())) {
        setupSuggestionSection();
    }
}