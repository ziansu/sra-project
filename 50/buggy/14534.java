private void hideKeypad() {
    android.view.inputmethod.InputMethodManager imm = ((android.view.inputmethod.InputMethodManager) (_context.getSystemService(Context.INPUT_METHOD_SERVICE)));
    imm.hideSoftInputFromWindow(m_editTextHandle.getWindowToken(), 0);
}