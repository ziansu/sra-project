public static void showInputMethod(android.content.Context context) {
    android.view.inputmethod.InputMethodManager imm = ((android.view.inputmethod.InputMethodManager) (context.getSystemService(Context.INPUT_METHOD_SERVICE)));
    imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);
}