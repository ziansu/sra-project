@java.lang.Override
public boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    boolean isEnterKey = (null != event) && ((event.getKeyCode()) == (android.view.KeyEvent.KEYCODE_ENTER));
    if ((actionId == (android.view.inputmethod.EditorInfo.IME_ACTION_SEARCH)) || isEnterKey) {
        dispatchSearch();
        return true;
    }
    return false;
}