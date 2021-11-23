public void setFont(java.lang.String customFont) {
    if (customFont != null) {
        if (((font) == null) || (!(font.equals(customFont)))) {
            try {
                android.graphics.Typeface typeFace = android.graphics.Typeface.createFromAsset(this.getContext().getAssets(), customFont);
                setTypeface(typeFace);
                font = customFont;
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
    }
}