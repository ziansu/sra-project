private void setupViews(android.util.AttributeSet attrs) {
    if (attrs != null) {
        applyXmlAttributes(attrs);
    }
    int sdkVersion = Build.VERSION.SDK_INT;
    if ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.JELLY_BEAN)) {
        setBackgroundDrawable(mBackgroundDrawable);
    }else
        if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.JELLY_BEAN)) {
            setBackground(mBackgroundDrawable);
        }
    
    setupQueryBar();
    if (!(isInEditMode())) {
        setupSuggestionSection();
    }
}