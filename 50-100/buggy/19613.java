@java.lang.Override
public void onClick(android.view.View v) {
    assert email != null;
    if (!(validEmail(email.getText().toString()))) {
        email.setError("Invalid Email");
        email.requestFocus();
    }else
        if (!(validPassword(password.getText().toString()))) {
            password.setError("Invalid Password");
            password.requestFocus();
        }else {
            android.widget.Toast.makeText(this, "Validation Success", Toast.LENGTH_LONG);
        }
    
}