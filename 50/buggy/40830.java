public static void setUsingAlternateTypefaceAndForcedLocale(android.content.Context context, boolean useAlternateTypeface, int localeCode) {
    br.com.carlosrafaelgn.fplay.ui.UI.isUsingAlternateTypeface = useAlternateTypeface;
    if (!(br.com.carlosrafaelgn.fplay.ui.UI.setForcedLocale(context, localeCode)))
        br.com.carlosrafaelgn.fplay.ui.UI.setUsingAlternateTypeface(context, useAlternateTypeface);
    
}