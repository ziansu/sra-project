public void hideSoftInput() {
    android.view.View view = ((android.app.Activity) (context)).getCurrentFocus();
    if (view == null)
        view = new android.view.View(context);
    
    android.view.inputmethod.InputMethodManager imm = ((android.view.inputmethod.InputMethodManager) (context.getSystemService(Activity.INPUT_METHOD_SERVICE)));
    if (imm == null)
        return ;
    
    imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
}