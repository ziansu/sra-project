@java.lang.Override
public void defocusFragment() {
    if ((activity) != null) {
        android.view.inputmethod.InputMethodManager imm = ((android.view.inputmethod.InputMethodManager) (activity.getSystemService(Context.INPUT_METHOD_SERVICE)));
        imm.hideSoftInputFromWindow(edit_text_native.getWindowToken(), 0);
    }
}