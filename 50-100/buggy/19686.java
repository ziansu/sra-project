public void resign() {
    if ((model.loggedIn) && (aiGame)) {
        switchToLobby();
    }else
        if ((model.loggedIn) && (!(aiGame))) {
            sendResign(consts.RESIGN);
            switchToLogin();
            closeSockets();
        }else
            switchToLogin();
        
    
}