@java.lang.Override
public boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    switch (actionId) {
        case android.view.inputmethod.EditorInfo.IME_ACTION_UNSPECIFIED :
        case android.view.inputmethod.EditorInfo.IME_ACTION_DONE :
        case android.view.inputmethod.EditorInfo.IME_ACTION_NEXT :
            savePerson();
            return true;
    }
    return false;
}