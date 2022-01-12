public void run() {
    android.view.inputmethod.InputMethodManager inputManager = ((android.view.inputmethod.InputMethodManager) (cordova.getActivity().getSystemService(Context.INPUT_METHOD_SERVICE)));
    android.view.View v = cordova.getActivity().getCurrentFocus();
    if (v == null) {
        callbackContext.error("No current focus");
    }else {
        inputManager.hideSoftInputFromWindow(v.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        callbackContext.success();
    }
}