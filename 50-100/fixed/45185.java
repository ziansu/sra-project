private void obtainStyledAttributes(final android.util.AttributeSet attributeSet) {
    android.content.res.TypedArray typedArray = getContext().obtainStyledAttributes(attributeSet, R.styleable.FloatingActionButton);
    try {
        obtainSize(typedArray);
        obtainColor(typedArray);
        obtainActivatedColor(typedArray);
        obtainPressedColor(typedArray);
        obtainDisabledColor(typedArray);
        obtainIcon(typedArray);
        obtainVisibilityAnimationDuration(typedArray);
    } finally {
        typedArray.recycle();
    }
}