public int compare(Cell a, Cell b) {
    if ((a.getF()) < (b.getF()))
        return -1;
    
    if ((a.getF()) > (b.getF()))
        return 1;
    
    return 0;
}