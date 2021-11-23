public int getLenght() {
    android.content.SharedPreferences preferences = android.preference.PreferenceManager.getDefaultSharedPreferences(getContext());
    boolean v = preferences.getBoolean("EXTRA_SMALL_FONT", false);
    if (v)
        return 8;
    else
        return 6;
    
}