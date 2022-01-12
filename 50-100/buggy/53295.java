private void resetGame() {
    stage.dispose();
    initializeScene();
    initializeDevelopScene();
    activeTetromino = new int[][]{ new int[]{ 0 , 0 } , new int[]{ 0 , 0 } , new int[]{ 0 , 0 } , new int[]{ 0 , 0 } };
    gameBoard = new com.badlogic.gdx.scenes.scene2d.ui.Image[10][20];
    hasActiveTetromino = false;
    isGameOver = false;
}