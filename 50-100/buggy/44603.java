private void loginMenuAction(int playerID, java.lang.String playerPassword) {
    try {
        player = engine.login(playerID, playerPassword);
    } catch (java.lang.NullPointerException e) {
        player = invalidPlayer;
    }
    if ((player) == (invalidPlayer)) {
        io.royale7.casino.Display.invalidUser();
        mainMenu();
    }else {
        loungeMenu();
    }
}