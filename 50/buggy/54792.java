private void drawGame(java.awt.Graphics g) {
    if (!(setup)) {
        setup = setupBoard();
    }
    if (newGoal) {
        newGoal = updateBoard();
    }
    drawGoal(g);
    drawPlayer(g);
}