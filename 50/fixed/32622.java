@java.lang.Override
public void onPause() {
    super.onPause();
    ((android.view.inputmethod.InputMethodManager) (getActivity().getSystemService(Context.INPUT_METHOD_SERVICE))).hideSoftInputFromWindow(emailRetv.getWindowToken(), 0);
}