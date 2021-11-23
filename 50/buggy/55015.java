@java.lang.Override
public void onClick(android.view.View view) {
    if (view == (btnSignUp)) {
        registerUser();
    }
    if (view == (btnLogInPrompt)) {
        finish();
        startActivity(new android.content.Intent(this, com.sarahrobinson.finalyearproject.activities.LoginActivity.class));
    }
}