public void login() throws java.io.IOException, java.net.URISyntaxException {
    java.lang.System.out.println("欢迎使用山东大学抢课助手");
    while (true) {
        getUserInfo();
        if (sendLoginRequest(usernanme, password))
            return ;
        
        if (!(ing.gzq.Utils.checkIfContinue()))
            java.lang.System.exit(0);
        
    } 
}