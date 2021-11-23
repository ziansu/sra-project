public boolean isTouchGround(int x, int y, int width, int height) {
    if (((ground.getBlock()[x][((y + height) + 1)]) == 1) || ((ground.getBlock()[(x + width)][((y + height) + 1)]) == 1))
        return true;
    
    return false;
}