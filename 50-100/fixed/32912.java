@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (hasFocus) {
        android.widget.EditText editText = ((android.widget.EditText) (v));
        editText.setText("");
    }else {
        android.view.inputmethod.InputMethodManager imm = ((android.view.inputmethod.InputMethodManager) (getContext().getSystemService(Context.INPUT_METHOD_SERVICE)));
        imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
    }
}