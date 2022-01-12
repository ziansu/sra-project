private void showSoftInput(boolean is) {
    android.view.inputmethod.InputMethodManager imm = ((android.view.inputmethod.InputMethodManager) (this.getActivity().getSystemService(Context.INPUT_METHOD_SERVICE)));
    if (is) {
        if (!(imm.isActive(mSearch)))
            imm.toggleSoftInput(InputMethodManager.SHOW_IMPLICIT, InputMethodManager.HIDE_NOT_ALWAYS);
        
    }else {
        if (imm.isActive(mSearch))
            imm.hideSoftInputFromWindow(this.getActivity().getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        
    }
}