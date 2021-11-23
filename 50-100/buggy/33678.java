protected java.lang.String doInBackground(java.lang.String... args) {
    etLogin = ((android.widget.EditText) (findViewById(R.id.etLogin)));
    bResend = ((android.widget.Button) (findViewById(R.id.bResend)));
    sweng500team2summer15.hov_helper.Account.AccountManagement resendUserVCode = new sweng500team2summer15.hov_helper.Account.AccountManagement();
    java.lang.String result = resendUserVCode.resendVerificationCode(etLogin.getText().toString());
    if ((etLogin.getText().toString()) == "") {
        return "Error: Please enter your email address.";
    }
    return result;
}