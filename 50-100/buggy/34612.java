@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    mListsSharedPreferences.edit().clear().apply();
    try {
        mListKey = mActiveListKeys.get(mActiveListSpinner.getSelectedItemPosition());
        mListPositionSelection = mActiveListSpinner.getSelectedItemPosition();
    } catch (java.lang.Exception e) {
    }
    android.content.SharedPreferences.Editor editor = mListsSharedPreferences.edit();
    editor.putInt(getString(R.string.LIST_SPINNER_POSITION), mListPositionSelection);
    editor.apply();
}