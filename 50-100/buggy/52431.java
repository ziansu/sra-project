private void hideKeyboard() {
    if ((getActivity().getCurrentFocus()) != null) {
        android.view.inputmethod.InputMethodManager inputMethodManager = ((android.view.inputmethod.InputMethodManager) (getActivity().getSystemService(Context.INPUT_METHOD_SERVICE)));
        inputMethodManager.hideSoftInputFromWindow(getActivity().getCurrentFocus().getWindowToken(), 0);
    }
}