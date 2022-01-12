protected boolean isValidFragment(java.lang.String fragmentName) {
    return (android.preference.PreferenceFragment.class.getName().equals(fragmentName)) || (com.is.was.be.wannareddit.SettingsActivity.GeneralPreferenceFragment.class.getName().equals(fragmentName));
}