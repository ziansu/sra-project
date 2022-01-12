public void hideSoftInput() {
    android.view.View view = ((android.app.Activity) (context)).getCurrentFocus();
    if (view == null)
        view = new android.view.View(((android.app.Activity) (context)));
    
    android.view.inputmethod.InputMethodManager imm = ((android.view.inputmethod.InputMethodManager) (((android.app.Activity) (context)).getSystemService(Activity.INPUT_METHOD_SERVICE)));
    if (imm == null)
        return ;
    
    imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
}