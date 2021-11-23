@java.lang.Override
public void run() {
    android.view.inputmethod.InputMethodManager inputManager = ((android.view.inputmethod.InputMethodManager) (this.getSystemService(Context.INPUT_METHOD_SERVICE)));
    inputManager.showSoftInput(mActivityPlanDetailBinding.etPlanTitle, 0);
}