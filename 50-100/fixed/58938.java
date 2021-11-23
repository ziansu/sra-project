@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if ((com.appteamnith.hillffair.Utils.checkData(Password.getText().toString())) && ((Password.getText().toString().length()) > 8)) {
        passwordTextInputLayout.setErrorEnabled(false);
    }else {
        passwordTextInputLayout.setErrorEnabled(true);
        passwordTextInputLayout.setError("PLEASE ENTER MORE THAN 8 CHARACTER");
    }
}