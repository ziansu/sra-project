public byte getMousePosPreGame(int x, int y) {
    if (x > (icons.get("selection_basin").getWidth()))
        return -2;
    
    final int i = (y - 6) / (interaction.GameScreen.SHIP_SPACING);
    if (i < (Ship.ALL_TYPES.length))
        return mechanics.Ship.ALL_TYPES[i];
    else
        return -1;
    
}