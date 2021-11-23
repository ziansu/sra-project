@java.lang.Override
public void onStateChanged(@android.support.annotation.NonNull
android.view.View bottomSheet, int newState) {
    if (((mViewSwitcher.getCurrentView()) != (mDescriptionText)) && (newState == 4)) {
        android.view.inputmethod.InputMethodManager imm = ((android.view.inputmethod.InputMethodManager) (getSystemService(Context.INPUT_METHOD_SERVICE)));
        closeKeyShowNext(imm);
    }
}