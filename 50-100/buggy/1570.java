public void processStartMenu(com.lordstephen77.dreamblocks.GraphicsHandler g) {
    startMenu.draw(g);
    if (!(leftClick)) {
        return ;
    }
    switch (startMenu.handleClick(screenMousePos.x, screenMousePos.y)) {
        case LOAD_GAME :
            startGame(true, WORLD_WIDTH.MEDIUM.getWidth());
            break;
        case NEW_GAME :
            newGame = true;
            break;
        case QUIT_GAME :
            quit();
            break;
    }
    leftClick = false;
}