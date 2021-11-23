private void increaseLevel() {
    if ((this.score) >= (com.company.gamestates.gameplayStates.GameState.player.getNextLevel())) {
        com.company.gamestates.gameplayStates.GameState.player.setNextLevel(((com.company.gamestates.gameplayStates.GameState.LEVEL_POINTS) * (com.company.gamestates.gameplayStates.GameState.player.getLevel())));
        if (com.company.eventHandlers.MouseInput.isMage) {
            PlayMusic.mage.stop();
        }else {
            PlayMusic.archer.stop();
        }
        PlayMusic.fire.stop();
        com.company.gameobjects.entities.Player.inceraseLevel();
        this.isLevelGained = true;
        com.company.gamestates.StateManager.setCurrentState(new com.company.gamestates.menuStates.gameplayMenuStates.GainLevelState());
    }
}