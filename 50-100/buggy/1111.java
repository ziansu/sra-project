public void login() throws java.io.IOException, java.net.URISyntaxException {
    java.lang.System.out.println("欢迎使用山东大学抢课助手");
    while (true) {
        getUserInfo();
        if (sendLoginRequest(usernanme, password))
            break;
        
        if (!(ing.gzq.Utils.checkIfContinue()))
            break;
        
    } 
}