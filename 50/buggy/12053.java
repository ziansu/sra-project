public static long getSelectedStoryPageSecondary(android.content.Context context) {
    return android.preference.PreferenceManager.getDefaultSharedPreferences(context).getLong(utils.UWPreferenceManager.STORY_PAGE_SECONDARY, (-1));
}