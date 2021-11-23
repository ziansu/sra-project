public boolean isTouchGround(int x, int y, int width) {
    if (((ground.getBlock()[x][(y + 1)]) == 1) || ((ground.getBlock()[(x + width)][(y + 1)]) == 1))
        return true;
    
    return false;
}