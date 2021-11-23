public boolean onKey(android.view.View v, int keyCode, android.view.KeyEvent event) {
    if (keyCode == (android.view.KeyEvent.KEYCODE_ENTER)) {
        clearSuggestions();
        fromEditingToSearch();
        return true;
    }
    return false;
}