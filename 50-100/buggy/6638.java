private boolean isValidDigitFields() {
    boolean isValid = true;
    if (com.zhour.utils.Utility.isValueNullOrEmpty(com.zhour.fragments.AlienCarFragment.et_vehicle_number.getText().toString())) {
        com.zhour.utils.Utility.setSnackBar(mParent, com.zhour.fragments.AlienCarFragment.et_vehicle_number, "Please write code");
        isValid = false;
    }else
        if ((com.zhour.fragments.AlienCarFragment.et_vehicle_number.getText().toString().length()) != 4) {
            com.zhour.utils.Utility.setSnackBar(mParent, com.zhour.fragments.AlienCarFragment.et_vehicle_number, "Code must be 4 digit");
            isValid = false;
        }
    
    return isValid;
}