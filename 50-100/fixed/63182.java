public void changeLevel(int lvl) {
    if (lvl == 1) {
        gameState[0] = 9;
        gameState[1] = 9;
        gameState[2] = 10;
    }else
        if (lvl == 2) {
            gameState[0] = 16;
            gameState[1] = 16;
            gameState[2] = 40;
        }else
            if (lvl == 3) {
                gameState[0] = 16;
                gameState[1] = 30;
                gameState[2] = 99;
            }
        
    
}