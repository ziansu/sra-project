private boolean setRow(int newRow) {
    if ((newRow >= 0) && (newRow < 9)) {
        row = newRow;
        return true;
    }else
        return false;
    
}