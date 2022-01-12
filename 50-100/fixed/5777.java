@java.lang.Override
public void onFocusChange(android.view.View view, boolean hasFocus) {
    if (!hasFocus) {
        java.lang.String val = (autoPincode.getText()) + "";
        if (java.util.Arrays.asList(strPinArr).contains(val)) {
            java.lang.System.out.println("CITY CITY CITY");
        }else {
            autoPincode.setError("Invalid Pincode");
            return ;
        }
    }
}