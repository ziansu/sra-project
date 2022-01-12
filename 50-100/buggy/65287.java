private android.content.res.ColorStateList getCurrentColorState() {
    if ((refIndex) == null)
        return null;
    
    android.content.res.ColorStateList colorStateList = null;
    android.content.res.ColorStateList[] colors = tv.colors;
    if ((colors != null) && ((colors.length) > 0)) {
        colorStateList = colors[((refIndex) % (colors.length))];
        if (colorStateList == null)
            colorStateList = tv.getTextColors();
        
    }
    return colorStateList;
}