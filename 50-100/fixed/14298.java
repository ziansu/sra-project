public void onClick(android.content.DialogInterface di, int position) {
    java.lang.CharSequence id = ids[position];
    com.anysoftkeyboard.utils.Logger.d(com.anysoftkeyboard.TAG, "User selected '%s' with id %s", items[position], id);
    android.view.inputmethod.EditorInfo currentEditorInfo = getCurrentInputEditorInfo();
    getKeyboardSwitcher().nextAlphabetKeyboard(currentEditorInfo, id.toString());
}