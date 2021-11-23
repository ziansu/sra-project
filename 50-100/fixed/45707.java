public void onFocusChange(android.view.View v, boolean hasFocus) {
    if (!hasFocus) {
        java.lang.String email = email_input.getText().toString();
        if (!(com.example.noah.onthefly.util.Mailer.isEmailValid(email))) {
            email_input.setTextColor(android.graphics.Color.RED);
            android.widget.Toast.makeText(this, "You have entered an invalid email address.", Toast.LENGTH_SHORT).show();
        }else {
            email_input.setTextColor(android.graphics.Color.BLACK);
        }
        if (create.hasFocus()) {
            createAccount(v);
        }
    }
}