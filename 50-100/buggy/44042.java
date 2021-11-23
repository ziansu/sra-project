@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if ((Phoneno.getText().toString().length()) == 10) {
        phonenoTextInputLayout.setErrorEnabled(false);
        isphone = true;
    }else {
        isphone = false;
        Phoneno.setError("NOT VALID PHONE NUMBER");
    }
}