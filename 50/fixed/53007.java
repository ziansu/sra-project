public int getIndexForCustomColumn(model.DataColumnInfo dci) {
    for (int i = 0; i < (dataColumns.size()); i++)
        if (dci.equals(dataColumns.get(i)))
            return i;
        
    
    return -1;
}