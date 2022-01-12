private android.graphics.Typeface getTypeface() {
    if ((isBold) && ((font) == null)) {
        return android.graphics.Typeface.create(com.muddzdev.styleabletoastlibrary.StyleableToast.DEFAULT_CONDENSED_FONT, Typeface.BOLD);
    }else
        if ((isBold) && ((font) != null)) {
            return android.graphics.Typeface.create(font, Typeface.BOLD);
        }else
            if ((font) != null) {
                return android.graphics.Typeface.create(font, Typeface.NORMAL);
            }else {
                return android.graphics.Typeface.create(com.muddzdev.styleabletoastlibrary.StyleableToast.DEFAULT_CONDENSED_FONT, Typeface.NORMAL);
            }
        
    
}