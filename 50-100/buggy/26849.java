public boolean fillCell(int x, int y, int value) {
    if ((((!(isInBound(x, y))) || ((table[x][y]) == null)) || (!(inputInBound(value)))) || (!(table[x][y].isPlayCell())))
        return false;
    
    table[x][y].setDownValue(value);
    return true;
}