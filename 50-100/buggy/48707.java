private void newGame() {
    com.sem.btrouble.model.Room room = dataloader.loadRoom(currentLevel);
    if (com.sem.btrouble.BTrouble.getSurvival()) {
        game = new com.sem.btrouble.game.SinglePlayerSurvivalGame(room, this);
    }else {
        game = new com.sem.btrouble.game.SinglePlayerGame(room, this);
    }
    java.util.List<com.sem.btrouble.model.Bubble> blist = dataloader.loadBubbles(currentLevel);
    game.spawnBubbles(blist);
    game.addPlayer(player);
    game.startGame();
}