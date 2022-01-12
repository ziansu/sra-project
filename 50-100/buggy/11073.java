private void exitGame(edu.chalmers.vaporwave.model.menu.MenuState destinationMenu) {
    this.gameMusic.stopSound();
    this.arenaModel.getArenaMovables().clear();
    this.arenaModel.clearTiles();
    this.enemies.clear();
    this.deadEnemies.clear();
    edu.chalmers.vaporwave.event.GameEventBus.getInstance().post(new edu.chalmers.vaporwave.event.ExitToMenuEvent(destinationMenu, this.players, this.gameType));
    for (edu.chalmers.vaporwave.model.Player player : this.players) {
        player.resetPlayerGameStats();
    }
}