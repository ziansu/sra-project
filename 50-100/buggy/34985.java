@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if ((com.appteamnith.hillffair.Utils.checkData(Email.getText().toString())) && (Patterns.EMAIL_ADDRESS.matcher(Email.getText().toString()).matches())) {
        emailTextInputLayout.setErrorEnabled(false);
        isemail = true;
    }else {
        Email.setError("PLEASE ENTER THE EMAIL");
        isemail = false;
    }
}