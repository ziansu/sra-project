@java.lang.Override
public boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    boolean handled = false;
    if (actionId == (android.view.inputmethod.EditorInfo.IME_ACTION_GO)) {
        Login();
        handled = true;
    }
    return handled;
}