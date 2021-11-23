private void setStyles(android.content.Context context, android.util.AttributeSet attrs) {
    if (attrs != null) {
        android.content.res.TypedArray attributes = context.obtainStyledAttributes(attrs, R.styleable.CenteredImageTextButton);
        int colourDefault = attributes.getColor(R.styleable.CenteredImageTextButton_filterColorDefault, -1);
        int colourTouched = attributes.getColor(R.styleable.CenteredImageTextButton_filterColorTouched, -1);
        attributes.recycle();
        if (!(isInEditMode())) {
            ac.robinson.util.UIUtilities.setButtonColorFilters(this, colourDefault, colourTouched);
        }
    }
}