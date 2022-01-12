public void run() {
    webView.getView().requestFocus();
    android.view.inputmethod.InputMethodManager mgr = ((android.view.inputmethod.InputMethodManager) (cordova.getActivity().getSystemService(Context.INPUT_METHOD_SERVICE)));
    mgr.showSoftInput(webView.getView(), InputMethodManager.SHOW_IMPLICIT);
    ((android.view.inputmethod.InputMethodManager) (cordova.getActivity().getSystemService(Context.INPUT_METHOD_SERVICE))).showSoftInput(webView.getView(), 0);
}