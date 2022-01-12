public static java.lang.String[] getTagsPreference(android.content.Context context) {
    android.content.SharedPreferences preferences = android.preference.PreferenceManager.getDefaultSharedPreferences(context);
    java.lang.String tagsJson = preferences.getString(com.naman14.hacktoberfest.utils.Utils.PREFERENCE_TAGS, null);
    if (tagsJson == null) {
        return new java.lang.String[]{  };
    }else {
        return new com.google.gson.Gson().fromJson(tagsJson, java.lang.String[].class);
    }
}