public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    switch (boydjohnson.SnakeGame.getGameStage()) {
        case 1 :
            {
                displayInstructions(g);
                break;
            }
        case 2 :
            {
                displayGame(g);
                break;
            }
        case 3 :
            {
                displayGameOver(g);
                break;
            }
        default :
            {
                displayGameWon(g);
                break;
            }
    }
}