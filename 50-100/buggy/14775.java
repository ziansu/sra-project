@java.lang.Override
public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (!hasFocus) {
        if (password.getText().toString().isEmpty()) {
            tilPass.setError(getString(R.string.password_blank));
            signIn.setClickable(false);
            org.ecomap.android.app.utils.SnackBarHelper.showWarningSnackBar(getActivity(), v, R.string.fill_all_fields, Snackbar.LENGTH_LONG);
        }else {
            tilPass.setErrorEnabled(false);
            signIn.setClickable(true);
        }
    }
}