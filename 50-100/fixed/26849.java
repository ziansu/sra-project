public boolean fillCell(int x, int y, int value) {
    if ((((!(isInBound(x, y))) || ((table[x][y]) == null)) || (!(table[x][y].isPlayCell()))) || (!(inputInBound(value))))
        return false;
    
    table[x][y].setDownValue(value);
    return true;
}