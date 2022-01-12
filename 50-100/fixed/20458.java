@java.lang.Override
protected void onResume() {
    mPrefs.registerOnSharedPreferenceChangeListener(mPrefChangeListener);
    mDisplayExtras = mPrefs.getBoolean("Display_Price_Quantity", true);
    mDisplayCategoryExtras = mPrefs.getBoolean("Display_Category_Totals", true);
    mHideDoneItems = mPrefs.getBoolean("Delete_Bought_Items", false);
    mFontSize = java.lang.Integer.valueOf(mPrefs.getString("Item_Font_Size", "3"));
    mListView.invalidateViews();
    mCurrencyFormat = ((com.geekjamboree.noteit.NoteItApplication) (getApplication())).getCurrencyFormat(false);
    doDisplayPendingTotal();
    super.onResume();
}