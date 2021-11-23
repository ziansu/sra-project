private void hideKeyboard() {
    android.view.View view = getActivity().getCurrentFocus();
    if (view != null) {
        android.view.inputmethod.InputMethodManager inputMethodManager = ((android.view.inputmethod.InputMethodManager) (getActivity().getSystemService(Context.INPUT_METHOD_SERVICE)));
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}