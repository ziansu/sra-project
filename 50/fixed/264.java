public void updateFontName(java.lang.String fontName) {
    if (fontName != null) {
        android.graphics.Typeface font = android.graphics.Typeface.createFromAsset(getContext().getAssets(), ("fonts/" + fontName));
        setTypeface(font);
        mfontName = fontName;
    }
}