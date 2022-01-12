public me.binge.selenium.qq.common.LoginResult login(java.util.Map<java.lang.String, java.lang.String> loginInfo, java.lang.String cacheKey, me.binge.selenium.qq.concurrent.QQLoginCallback callback) {
    java.lang.String email = loginInfo.get(Cacher.EMAIL_KEY);
    java.lang.String password = loginInfo.get(Cacher.PWD_KEY);
    java.lang.String indepentPassword = loginInfo.get(Cacher.INDEPENT_PWD_KEY);
    org.openqa.selenium.chrome.ChromeDriver webDriver = new org.openqa.selenium.chrome.ChromeDriver(me.binge.selenium.qq.login.QQLogin.caps);
    callback.setWebDriver(webDriver);
    me.binge.selenium.qq.login.QQLogin.cacheKeyLocal.set(cacheKey);
    me.binge.selenium.qq.login.QQLogin.webDriverLocal.set(webDriver);
    return login(email, password, indepentPassword, cacheKey, false);
}