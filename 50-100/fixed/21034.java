public static android.graphics.Typeface getSansCondensed(android.content.Context context, boolean bold) {
    synchronized(com.ncuculova.taximk.FontHelper.lock) {
        if ((!bold) && ((com.ncuculova.taximk.FontHelper.mSansCondensed) == null))
            com.ncuculova.taximk.FontHelper.mSansCondensed = android.graphics.Typeface.createFromAsset(context.getAssets(), "OpenSans-CondLight.ttf");
        else
            if (bold && ((com.ncuculova.taximk.FontHelper.mSansBoldCondensed) == null))
                com.ncuculova.taximk.FontHelper.mSansBoldCondensed = android.graphics.Typeface.createFromAsset(context.getAssets(), "OpenSans-CondBold.ttf");
            
        
    }
    return bold ? com.ncuculova.taximk.FontHelper.mSansBoldCondensed : com.ncuculova.taximk.FontHelper.mSansCondensed;
}