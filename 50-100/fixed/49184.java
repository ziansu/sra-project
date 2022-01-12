private int getMaxLengthInColumn(java.util.List<java.util.List<java.lang.String>> table, int column) {
    int result = 0;
    int currentSize;
    for (int i = 0; i < (table.size()); i++) {
        if ((table.get(i).get(column)) != null) {
            currentSize = table.get(i).get(column).length();
            if (currentSize > result)
                result = currentSize;
            
        }
    }
    return result;
}