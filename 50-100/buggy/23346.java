@org.androidannotations.annotations.Click(value = R.id.buttonLogin)
public void clickAction() {
    authRequest.setPassword(editTextPassword.getText().toString());
    android.content.Intent intent = new android.content.Intent();
    intent.putExtra(Constants.EXTRA_AUTH_REQUEST, authRequest);
    intent.setClass(getActivity(), com.lykkex.LykkeWallet.gui.activity.authentication.AuthenticationActivity_.class);
    getActivity().startActivityForResult(intent, AuthenticationActivity.AUTHENTICATION_REQUEST_CODE);
    getActivity().finish();
}