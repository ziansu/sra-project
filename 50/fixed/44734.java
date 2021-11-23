@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
    switch (view.getId()) {
        case R.id.input_reg_fullname :
            validateFullName();
            break;
        case R.id.input_reg_Surname :
            validateSurname();
            break;
    }
}