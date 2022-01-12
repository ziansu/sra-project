@java.lang.Override
public boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    if (actionId == (android.view.inputmethod.EditorInfo.IME_ACTION_DONE)) {
        if ((mesaj.getText().toString().trim().length()) > 0) {
            postToMenemen(mesaj.getText().toString());
            mesaj.setText("");
        }
        return true;
    }
    return false;
}