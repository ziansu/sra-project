@java.lang.Override
public void onPause() {
    super.onPause();
    getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_FULL_SENSOR);
    ((android.view.inputmethod.InputMethodManager) (getActivity().getSystemService(Context.INPUT_METHOD_SERVICE))).hideSoftInputFromWindow(emailRetv.getWindowToken(), 0);
}