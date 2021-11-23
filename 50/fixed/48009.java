private void setLoadedSorting(java.lang.String sorting) {
    android.content.SharedPreferences preferences = android.preference.PreferenceManager.getDefaultSharedPreferences(getActivity());
    android.content.SharedPreferences.Editor edit = preferences.edit();
    edit.putString(getString(R.string.loaded_sorting), sorting);
    edit.commit();
}