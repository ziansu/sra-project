public java.lang.String tryLogin() {
    java.lang.System.out.println(((userName) + " attempting login."));
    if (Controls.Driver.checkLogin(userName, password)) {
        java.lang.System.out.println(((userName) + " logged in."));
        userType = D.getAccountTypeByUserName(userName);
        return "toHome";
    }
    result = "Invalid Username and/or Password";
    return null;
}