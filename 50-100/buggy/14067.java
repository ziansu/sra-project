@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    java.lang.String pass1 = mPassword.getText().toString();
    java.lang.String pass2 = mConfirmPassword.getText().toString();
    if (pass1.equals(pass2)) {
        mPasswordMessage.setVisibility(View.VISIBLE);
        mPasswordMessage.setTextColor(Color.GREEN);
        mPasswordMessage.setText(R.string.passwords_matched);
    }else {
        mPasswordMessage.setVisibility(View.INVISIBLE);
        mPasswordMessage.setTextColor(Color.RED);
        mPasswordMessage.setText(R.string.passwords_not_matched);
    }
}