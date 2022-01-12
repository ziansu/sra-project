public static boolean checkGameWon() {
    if ((game.getCurrentLevelInt()) == ((game.getLevelList().size()) - 1)) {
        game.NormalDriver.gameScreen.dispose();
        game.log.Logger.log("Frame destroyed", 9, 4);
        new game.screens.WinningScreen(game.NormalDriver.driver, game.NormalDriver.name);
        return true;
    }
    return false;
}