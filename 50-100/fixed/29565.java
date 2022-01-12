public boolean isGroundAt(int x, int y) {
    if ((((x < 0) || (y < 0)) || (x >= (gui.Main.GAME_WIDTH))) || (y >= (gui.Main.GAME_HEIGHT)))
        return false;
    
    return (levelImageData[(((gui.Main.GAME_WIDTH) * y) + x)]) != (-1);
}