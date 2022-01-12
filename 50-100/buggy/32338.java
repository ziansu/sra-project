@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    java.lang.String strPinCode = auto_pincodeNominee.getText().toString();
    if (!(finalPincodeList.contains(strPinCode))) {
        auto_pincodeNominee.setError("Invalid Pincode");
        return ;
    }else {
        auto_pincodeNominee.setError(null);
        return ;
    }
}