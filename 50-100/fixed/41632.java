public void onLoginError(java.lang.String message) {
    new android.support.v7.app.AlertDialog.Builder(getActivity()).setTitle(getActivity().getString(R.string.login_error)).setMessage(message).setPositiveButton(android.R.string.ok, null).create().show();
    mLoggingIn = false;
}