public void changeLevel(int lvl) {
    if (lvl == 1) {
        gameState.add(9);
        gameState.add(9);
        gameState.add(10);
    }else
        if (lvl == 2) {
            gameState.add(16);
            gameState.add(16);
            gameState.add(40);
        }else
            if (lvl == 3) {
                gameState.add(16);
                gameState.add(30);
                gameState.add(99);
            }
        
    
}