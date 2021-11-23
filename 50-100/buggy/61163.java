private boolean isFieldInsideBoard(int x, int y) {
    if ((((y < 0) || (x < 0)) || (y >= (height))) || (x >= (width)))
        return false;
    
    return true;
}