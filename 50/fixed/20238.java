public boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    if (actionId == (android.view.inputmethod.EditorInfo.IME_ACTION_SEARCH)) {
        clearSuggestions();
        fromEditingToSearch(true);
        return true;
    }
    return false;
}