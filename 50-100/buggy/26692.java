@java.lang.Override
public boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    if (actionId == (android.view.inputmethod.EditorInfo.IME_ACTION_DONE)) {
        if ((mesaj.getText().length()) > 0) {
            if ((Build.VERSION.SDK_INT) >= 11)
                postToMenemen(mesaj.getText().toString());
            
            mesaj.setText("");
        }
        return true;
    }
    return false;
}