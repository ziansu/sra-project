private void update() {
    if ((Main.appState) == (Main.GAME_STATE)) {
        if ((Main.gameState) == (Main.GAME_DUNGEON)) {
        }else
            if ((Main.gameState) == (Main.GAME_BATTLE)) {
                runBattle();
            }
        
        if (Main.updateStateChange) {
            if ((Main.gameState) == (Main.GAME_SHOP)) {
                generateDungeon();
                Main.updateStateChange = false;
            }
        }
    }
}