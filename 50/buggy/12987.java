private void login() {
    if (prefs.contains("OAUTHACCESSTOKEN"))
        loginValidatedUser();
    else
        loginNewUser();
    
}