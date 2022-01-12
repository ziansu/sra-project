@java.lang.Override
public boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    boolean handled = false;
    if (actionId == (android.view.inputmethod.EditorInfo.IME_ACTION_SEND)) {
        sendMessage(currChannel, editText.getText().toString());
        handled = true;
        editText.setText("");
        android.view.inputmethod.InputMethodManager mgr = ((android.view.inputmethod.InputMethodManager) (getSystemService(Context.INPUT_METHOD_SERVICE)));
        mgr.hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }
    return handled;
}