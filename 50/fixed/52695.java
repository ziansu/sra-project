public int getColumnAt(int i) {
    if ((columnCount) == 0)
        return 0;
    
    return i % (columnCount);
}