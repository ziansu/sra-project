private boolean isOutOfBoard(int dy, int dx) {
    if ((((x) + dx) <= 0) || (((x) + dx) > (HorseBirthday.BOARD_SIZE)))
        return true;
    
    if ((((y) + dy) <= 0) || (((y) + dy) > (HorseBirthday.BOARD_SIZE)))
        return true;
    
    return false;
}