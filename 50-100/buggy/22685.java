@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if ((((userNameEt.getText().length()) >= 2) && ((passwordEt.getText().length()) >= 6)) && ((verifyPasswordEt.getText().length()) >= 6))
        registerBt.setEnabled(true);
    else
        registerBt.setEnabled(false);
    
}