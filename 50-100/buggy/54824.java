private void processStartOver() {
    if (mainGame.isLanMultiplayer()) {
        if (mainGame.isHost()) {
            java.lang.System.out.println("HOST FORCES RESTART");
            mainGame.getHost().updateRestart();
        }else
            if (mainGame.isClient()) {
                java.lang.System.out.println("CLIENT FORCES RESTART");
                mainGame.getClient().updateRestart();
            }
        
    }
    mainGame.resetLifeCount();
    mainGame.resetLevelCount();
    mainGame.setScore(0);
    mainGame.setSwitchState(mainGame.getGameState());
}