@java.lang.Override
public boolean onEditorAction(final android.widget.TextView v, final int actionId, final android.view.KeyEvent event) {
    if ((event != null) && ((android.view.KeyEvent.KEYCODE_ENTER) == (event.getKeyCode()))) {
        return true;
    }
    if (actionId == (android.view.inputmethod.EditorInfo.IME_ACTION_GO)) {
        login();
        return true;
    }
    return false;
}