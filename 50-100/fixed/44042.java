@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if ((Phoneno.getText().toString().length()) == 10) {
        phonenoTextInputLayout.setErrorEnabled(false);
        isphone = true;
    }else {
        phonenoTextInputLayout.setError("NOT VALID PHONE NUMBER");
        isphone = false;
    }
}