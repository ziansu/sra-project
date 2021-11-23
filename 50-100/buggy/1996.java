public int getColId(java.lang.String colName) {
    for (int i = 0; i < (schema.size()); i++) {
        if (schema.get(i).getName().equals(colName))
            return i;
        
    }
    return -1;
}