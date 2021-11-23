public int linSearch(Compareable c) {
    int retInt = -1;
    for (int i = 0; (i <= (_lastPos)) && (retInt == (-1)); i++) {
        if (_data[i].equals(c))
            retInt = i;
        
    }
    return retInt;
}