private int getEmojiCoount() {
    android.content.SharedPreferences preferences = android.preference.PreferenceManager.getDefaultSharedPreferences(mContext);
    return preferences.getInt("emojiCount", 0);
}