public static void showSoftKeyboard(android.app.Activity activity, android.view.View view) {
    if ((activity != null) && (view.requestFocus())) {
        android.view.inputmethod.InputMethodManager imm = ((android.view.inputmethod.InputMethodManager) (activity.getSystemService(Context.INPUT_METHOD_SERVICE)));
        boolean isShowing = imm.showSoftInput(view, InputMethodManager.SHOW_IMPLICIT);
        if (!isShowing) {
            activity.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
        }
    }
}