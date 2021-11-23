public void paintComponent(java.awt.Graphics g) {
    super.paintComponent(g);
    boydjohnson.DrawSnakeGamePanel.gameStage = boydjohnson.SnakeGame.getGameStage();
    switch (boydjohnson.DrawSnakeGamePanel.gameStage) {
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