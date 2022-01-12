public void cleanup() {
    if ((mContext) == null)
        return ;
    
    commitPending();
    android.content.SharedPreferences globalPrefs = android.preference.PreferenceManager.getDefaultSharedPreferences(mContext);
    globalPrefs.unregisterOnSharedPreferenceChangeListener(this);
    mContext = null;
}