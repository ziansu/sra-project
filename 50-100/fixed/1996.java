public int getColId(java.lang.String colName) {
    if (((schema) == null) || (schema.isEmpty())) {
        return -1;
    }
    for (int i = 0; i < (schema.size()); i++) {
        if (colName.equals(schema.get(i).getName()))
            return i;
        
    }
    return -1;
}