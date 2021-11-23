public int getRowAt(int i) {
    if ((columnCount) == 0)
        return 0;
    
    return (i / (columnCount)) + 1;
}