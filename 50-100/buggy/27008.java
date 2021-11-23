@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.buttonGoogleSignIn :
            signInWithGoogle();
            break;
        case R.id.buttonWelcomeLogin :
            startActivityForResult(new android.content.Intent(this, com.project.sustain.LoginActivity.class), com.project.sustain.WelcomeActivity.EMAIL_SIGN_IN);
            break;
        case R.id.buttonWelcomeRegister :
            startActivity(new android.content.Intent(this, com.project.sustain.RegistrationActivity.class));
            break;
        case R.id.buttonLogout :
            signOut();
            break;
    }
}