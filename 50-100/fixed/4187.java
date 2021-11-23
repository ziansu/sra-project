public static void resetLanguage(android.app.Activity activity, java.lang.String language) {
    if (!(android.text.TextUtils.equals(language, org.awesomeapp.messenger.Preferences.getLanguage()))) {
        org.awesomeapp.messenger.util.Languages.setLanguage(activity, language, true);
        org.awesomeapp.messenger.Preferences.setLanguage(language);
        org.awesomeapp.messenger.util.Languages.forceChangeLanguage(activity);
        if (language.equalsIgnoreCase("bo")) {
            org.ironrabbit.type.CustomTypefaceManager.loadFromAssets(activity);
        }else {
            org.ironrabbit.type.CustomTypefaceManager.setTypeface(null);
        }
    }
}