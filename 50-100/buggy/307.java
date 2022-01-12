private static java.lang.String getLanguageDisplayName(java.lang.String isoCode) {
    android.content.Context context = org.mercycorps.translationcards.MainApplication.getContextFromMainApp();
    switch (isoCode) {
        case "ar" :
            return context.getString(R.string.name_ar);
        case "en" :
            return context.getString(R.string.name_en);
        case "fa" :
            return context.getString(R.string.name_fa);
        case "ps" :
            return context.getString(R.string.name_ps);
        default :
            return isoCode;
    }
}