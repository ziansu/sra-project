public void user(java.lang.String account, java.lang.String password) {
    if (Android()) {
        loginAndroid(account, password);
    }
    if (IOS()) {
        loginIOS(account, password);
    }
}