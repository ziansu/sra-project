private void checkWin() {
    switch (gameState) {
        case GOLDTURN :
            checkSilverRabbitWin();
            checkGoldRabbitWin();
            checkNoRabbitsWin(PieceColour.GOLD, email.com.gmail.songjiapei.arimaa.GameEngine.GameState.GAMEOVERSILVER);
            checkNoRabbitsWin(PieceColour.SILVER, email.com.gmail.songjiapei.arimaa.GameEngine.GameState.GAMEOVERGOLD);
            break;
        case SILVERTURN :
            checkGoldRabbitWin();
            checkSilverRabbitWin();
            checkNoRabbitsWin(PieceColour.SILVER, email.com.gmail.songjiapei.arimaa.GameEngine.GameState.GAMEOVERGOLD);
            checkNoRabbitsWin(PieceColour.GOLD, email.com.gmail.songjiapei.arimaa.GameEngine.GameState.GAMEOVERSILVER);
            break;
        default :
            break;
    }
}