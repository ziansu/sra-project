public void onSearchRequest() {
    if (!(mInput.isShown())) {
        mInput.setVisibility(View.VISIBLE);
        mInput.requestFocus();
        android.view.inputmethod.InputMethodManager imm = ((android.view.inputmethod.InputMethodManager) (getFFCActivity().getSystemService(Context.INPUT_METHOD_SERVICE)));
        imm.showSoftInput(mInput, InputMethodManager.SHOW_FORCED);
    }
}