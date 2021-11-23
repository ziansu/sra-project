public int fieldNameToIndex(java.lang.String name) throws java.util.NoSuchElementException {
    for (int i = 0; i < (TDarray.size()); i++) {
        if ((TDarray.get(i).fieldName) == name)
            return i;
        
    }
    throw new java.util.NoSuchElementException();
}