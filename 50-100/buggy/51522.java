public void setUp() throws java.lang.Exception {
    super.setUp();
    solo = new com.robotium.solo.Solo(getInstrumentation());
    com.arnastofnun.idordabanki.preferences.SharedPrefs.getEditor().putString("lang", "EN");
    getActivity();
    android.provider.SearchRecentSuggestions suggestions = new android.provider.SearchRecentSuggestions(getActivity().getApplicationContext(), com.arnastofnun.idordabanki.helpers.SearchAutoComplete.AUTHORITY, com.arnastofnun.idordabanki.helpers.SearchAutoComplete.MODE);
    suggestions.clearHistory();
    getActivity();
    solo.enterText(0, "hest*");
    solo.pressSoftKeyboardSearchButton();
    solo.waitForActivity(com.arnastofnun.idordabanki.activities.ResultsScreen.class);
}