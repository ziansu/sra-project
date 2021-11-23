@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.button_sign_in_with_google :
            signInWithGoogle();
            break;
        case R.id.button_login :
            signInEmail();
            break;
        case R.id.button_create_account :
            createAccountEmail();
            break;
    }
}