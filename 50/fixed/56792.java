public void onLoginSuccess() {
    _loginButton.setEnabled(true);
    startActivity(new android.content.Intent(getContext(), unical.master.computerscience.yellit.graphic.Activities.WelcomeActivity.class));
    getActivity().overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
    getActivity().finish();
}