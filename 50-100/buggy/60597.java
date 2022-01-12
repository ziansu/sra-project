public boolean inBounds(int x, int y) {
    if (((x < 1) || (x >= ((floorWidth) - 1))) || ((y < 1) || (y >= ((floorHeight) - 1))))
        return false;
    else
        return true;
    
}