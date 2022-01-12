@java.lang.Override
protected void onFocusChanged(boolean focused, int direction, android.graphics.Rect previouslyFocusedRect) {
    super.onFocusChanged(focused, direction, previouslyFocusedRect);
    if (focused) {
        android.view.inputmethod.InputMethodManager imm = ((android.view.inputmethod.InputMethodManager) (getContext().getSystemService(Context.INPUT_METHOD_SERVICE)));
        imm.hideSoftInputFromWindow(getWindowToken(), 0);
        setKeyListener(null);
        dismissDropDown();
    }else {
        isPopup = false;
    }
}