private boolean ifExistsInAvailableList(java.lang.String tableName) {
    boolean ifExists = false;
    for (int i = 0; i < (availableTables.size()); i++) {
        if (tableName.equals(("Table " + (availableTables.get(i).getNumber()))))
            ifExists = true;
        
    }
    return ifExists;
}