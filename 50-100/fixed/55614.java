private void requestStateRefresh() {
    setTextColor(getContext().getResources().getColor(android.R.color.white));
    setTypeface(Typeface.DEFAULT_BOLD);
    setTextSize(bootstrapHeading.getTextSize(getContext()));
    android.graphics.drawable.Drawable bg = com.beardedhen.androidbootstrap.support.BootstrapDrawableFactory.bootstrapLabel(getContext(), bootstrapHeading, labelTheme, roundable, getHeight());
    if ((Build.VERSION.SDK_INT) >= 16) {
        setBackground(bg);
    }else {
        setBackgroundDrawable(bg);
    }
}