public void onLoginSuccess() {
    _loginButton.setEnabled(true);
    startActivity(new android.content.Intent(getApplicationContext(), unical.master.computerscience.yellit.graphic.Activities.WelcomeActivity.class));
    overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
    finish();
}