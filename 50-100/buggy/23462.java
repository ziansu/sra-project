public void initializeBot() {
    loadInfo();
    if (!(configEngine.isCommandandconquerStatus())) {
        networkService.firstConnectToMockServerDns();
        if (challengeToCommandConquer()) {
            java.lang.System.out.println("Bot is Ready");
        }else
            java.lang.System.out.println("Bot not Ready, authentication failed");
        
    }else {
        networkService.updateDnsInformation();
    }
}