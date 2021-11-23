public me.binge.selenium.qq.common.LoginResult login(java.util.Map<java.lang.String, java.lang.String> loginInfo, java.lang.String cacheKey) {
    java.lang.String email = loginInfo.get(Cacher.EMAIL_KEY);
    java.lang.String password = loginInfo.get(Cacher.PWD_KEY);
    java.lang.String indepentPassword = loginInfo.get(Cacher.INDEPENT_PWD_KEY);
    return login(email, password, indepentPassword, cacheKey, false);
}