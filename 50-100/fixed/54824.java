private void processStartOver() {
    if (mainGame.isLanMultiplayer()) {
        if (mainGame.isHost()) {
            mainGame.getHost().updateRestart();
        }else
            if (mainGame.isClient()) {
                mainGame.getClient().updateRestart();
            }
        
    }
    mainGame.resetLifeCount();
    mainGame.resetLevelCount();
    mainGame.setScore(0);
    mainGame.setSwitchState(mainGame.getGameState());
}