@butterknife.OnClick(value = R.id.btnSignup)
public void onRegisterButtonClicked() {
    if ((mListener) != null) {
        mListener.onRegisterButtonClicked("Signup button from Auth Fragment has just been clicked");
    }
}