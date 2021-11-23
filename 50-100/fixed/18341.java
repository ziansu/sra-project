@java.lang.Override
protected void onPreExecute() {
    android.view.inputmethod.InputMethodManager in = ((android.view.inputmethod.InputMethodManager) (getActivity().getSystemService(Context.INPUT_METHOD_SERVICE)));
    in.hideSoftInputFromWindow(mMessageET.getApplicationWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
    mSendBtn.setEnabled(false);
    mAttachFileButton.setEnabled(false);
}