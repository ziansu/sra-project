private boolean ifTableIsUnavailable(int number) {
    boolean ifExists = false;
    for (int i = 0; i < (unavailableTables.size()); i++) {
        if (number == (unavailableTables.get(i).getNumber()))
            ifExists = true;
        
    }
    return ifExists;
}