public boolean ValidateDetails(java.lang.String name, java.lang.String username, java.lang.String password, java.lang.String confirmPassword, java.sql.Date dob) {
    if (((((name != "") || (username != "")) || (password != "")) || (confirmPassword != "")) || (validateDate(dob))) {
        return true;
    }
    return false;
}