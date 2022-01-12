public void onClickBtn(android.view.View view) {
    if ((view.getId()) == (R.id.sign_submit_btn)) {
        signInUser(editTextEmailSignIn.getText().toString(), editTextPassSignIn.getText().toString());
    }else
        if ((view.getId()) == (R.id.signup_screen_btn)) {
            intentSignup = new android.content.Intent(this, com.singhgurjit.firebaselogin.firebaseloginsample.SignupActivity.class);
            startActivity(intentSignup);
        }
    
}