public static int getTranslationIndex(int x, int y) {
    int ret = 0;
    if (x > 9)
        ret |= go.util.TranslationHelper.isXFlippedMask;
    
    if (y > 9)
        ret |= go.util.TranslationHelper.isYFlippedMask;
    
    x = go.util.TranslationHelper.flipX(x, ret);
    y = go.util.TranslationHelper.flipY(x, ret);
    if (y > x)
        ret |= go.util.TranslationHelper.isDiagFlippedMask;
    
    return ret;
}