private void onBtnClickedSignup(android.view.View view) {
    if ((view.getId()) == (R.id.btn_for_login)) {
        intentBacktoLogin = new android.content.Intent(this, com.singhgurjit.firebaselogin.firebaseloginsample.LoginActivity.class);
        startActivity(intentBacktoLogin);
    }else
        if ((view.getId()) == (R.id.signup_submit_btn)) {
            createUser(signupEmail.getText().toString(), signupPassword.getText().toString());
        }
    
}