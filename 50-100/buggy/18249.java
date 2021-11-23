@java.lang.Override
public boolean onEditorAction(com.android.jjnunogarcia.smartsearch.activities.TextView textView, int actionId, android.view.KeyEvent keyEvent) {
    if (((textView.getId()) == (R.id.activity_search_toolbar_autocomplete_text_view)) && ((actionId == (android.view.inputmethod.EditorInfo.IME_ACTION_DONE)) || (actionId == (android.view.inputmethod.EditorInfo.IME_NULL)))) {
        searchTextView.dismissDropDown();
        hideKeyboard();
        displayLocationCount();
        return true;
    }
    return false;
}