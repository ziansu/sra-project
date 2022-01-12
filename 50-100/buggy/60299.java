private void sortLanguages() {
    if ((mLanguagePref) == null)
        return ;
    
    android.util.Pair<java.lang.String[], java.lang.String[]> pair = org.wordpress.android.util.WPPrefUtils.createSortedLanguageDisplayStrings(mLanguagePref.getEntryValues(), org.wordpress.android.util.WPPrefUtils.languageLocale(null));
    java.lang.String[] sortedEntries = pair.first;
    java.lang.String[] sortedValues = pair.second;
    mLanguagePref.setEntries(sortedEntries);
    mLanguagePref.setEntryValues(sortedValues);
    mLanguagePref.setDetails(org.wordpress.android.util.WPPrefUtils.createLanguageDetailDisplayStrings(sortedValues));
}