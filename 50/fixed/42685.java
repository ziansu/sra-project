private static void printIsSaved() {
    if (org.dungeon.game.Game.getGameState().isSaved()) {
        org.dungeon.io.IO.writeString("The game is saved.");
    }else {
        org.dungeon.io.IO.writeString("This game state is not saved.");
    }
}