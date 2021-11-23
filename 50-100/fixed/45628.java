private io.caly.calyandroid.Activity.SignupActivity.INPUT_STATE getInputState() {
    if ((selectedGender) == (-1))
        return io.caly.calyandroid.Activity.SignupActivity.INPUT_STATE.GENDER_NOT_SELECTED;
    
    if ((edtBirth.getText().toString().length()) != 4)
        return io.caly.calyandroid.Activity.SignupActivity.INPUT_STATE.BIRTH_NOT_SELECTED;
    
    if ((cbPolicy.isChecked()) == false)
        return io.caly.calyandroid.Activity.SignupActivity.INPUT_STATE.POLICY_NOT_SELECTED;
    
    return io.caly.calyandroid.Activity.SignupActivity.INPUT_STATE.ALL_SELECTED;
}