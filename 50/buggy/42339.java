public void signIn(java.lang.String user, java.lang.String pw) {
    if ((signInDropDownModule) == null)
        signInDropDownModule = new com.stamps.web.print.SignInDropDownModule(driver);
    
    signInDropDownModule.signIn(user, pw);
    printSignedInUsername();
    getPrintModule();
}