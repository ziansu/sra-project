@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if ((com.appteamnith.hillffair.Utils.checkData(ConfirmPassword.getText().toString())) && (ConfirmPassword.getText().toString().equals(Password.getText().toString()))) {
        confirmTextInputLayout.setErrorEnabled(false);
        ispassword = true;
    }else {
        confirmTextInputLayout.setError("PASSWORD DOES NOT MATCH");
        ispassword = false;
    }
}