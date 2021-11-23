@java.lang.Override
public boolean onEditorAction(android.widget.TextView textView, int i, android.view.KeyEvent keyEvent) {
    if (i == (android.view.inputmethod.EditorInfo.IME_ACTION_DONE)) {
        android.view.inputmethod.InputMethodManager inputMethodManager = ((android.view.inputmethod.InputMethodManager) (getActivity().getSystemService(Context.INPUT_METHOD_SERVICE)));
        inputMethodManager.hideSoftInputFromWindow(getView().getWindowToken(), 0);
        login();
        return true;
    }
    return false;
}