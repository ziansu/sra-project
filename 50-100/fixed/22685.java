@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if ((((userNameEt.getText().toString().trim().length()) >= 2) && ((passwordEt.getText().toString().trim().length()) >= 6)) && ((verifyPasswordEt.getText().toString().trim().length()) >= 6))
        registerBt.setEnabled(true);
    else
        registerBt.setEnabled(false);
    
}