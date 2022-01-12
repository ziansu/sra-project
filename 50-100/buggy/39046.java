public boolean validPhonenumber() {
    if (((phonenumber) == null) || ("".equalsIgnoreCase(phonenumber))) {
        phonenumber = "Phone number cannot be empty";
        hasError = true;
        return false;
    }
    if (((phonenumber.length()) != 10) || (!(com.imanage.util.Utility.isNumeric(phonenumber)))) {
        phonenumberError = "Invalid phone number";
        hasError = true;
        return false;
    }
    return true;
}