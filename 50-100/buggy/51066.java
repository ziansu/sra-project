@java.lang.Override
protected void OnPreferenceScreenChange(java.lang.String key) {
    if (key.equals(paulscode.android.mupen64plusae.persistent.GamePrefsActivity.SCREEN_CHEATS)) {
        mScreenCheats = ((android.support.v7.preference.PreferenceScreen) (findPreference(paulscode.android.mupen64plusae.persistent.GamePrefsActivity.SCREEN_CHEATS)));
        if ((mCategoryCheats) == null) {
            mCategoryCheats = ((android.support.v7.preference.PreferenceGroup) (findPreference(paulscode.android.mupen64plusae.persistent.GamePrefsActivity.CATEGORY_CHEATS)));
        }
        paulscode.android.mupen64plusae.preference.PrefUtil.setOnPreferenceClickListener(this, paulscode.android.mupen64plusae.persistent.GamePrefsActivity.ACTION_CHEAT_EDITOR, this);
        refreshCheatsCategory();
    }else {
        updateActivity();
    }
}