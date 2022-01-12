private java.lang.String getFormUrl(android.content.Context context) {
    android.content.SharedPreferences OpenTenurePreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    java.lang.String formUrl = OpenTenurePreferences.getString(OpenTenurePreferencesActivity.FORM_URL_PREF, "");
    if (formUrl.equalsIgnoreCase("")) {
        formUrl = java.lang.String.format(CommunityServerAPIUtilities.HTTPS_GETFORM, OpenTenurePreferences.getString(OpenTenurePreferencesActivity.CS_URL_PREF, OpenTenureApplication._DEFAULT_COMMUNITY_SERVER));
    }else
        formUrl = java.lang.String.format(CommunityServerAPIUtilities.HTTPS_GETFORM, formUrl);
    
    return formUrl;
}