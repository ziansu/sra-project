@java.lang.Override
public void onFocusChange(android.view.View view, boolean hasFocus) {
    if (hasFocus) {
        bottomNavigationBar.hide();
        android.util.Log.d("~focus", ((bottomNavigationBar.isHidden()) + ""));
    }else {
        android.view.inputmethod.InputMethodManager imm = ((android.view.inputmethod.InputMethodManager) (getActivity().getSystemService(Context.INPUT_METHOD_SERVICE)));
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        bottomNavigationBar.show();
    }
}