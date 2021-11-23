@java.lang.Override
public void onClick(android.view.View v) {
    int id = v.getId();
    switch (id) {
        case R.id.link_signup :
            {
                startActivity(new android.content.Intent(this, com.fimo_pitch.main.SignUpActivity.class));
                break;
            }
        case R.id.loginGG :
            {
                loginGoogle();
                break;
            }
        case R.id.btn_login :
            {
                loginUser(v);
            }
        case R.id.link_forgot :
            {
                startActivity(new android.content.Intent(this, com.fimo_pitch.main.ForgotPasswordActivity.class));
                break;
            }
    }
}