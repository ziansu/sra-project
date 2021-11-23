public int fieldNameToIndex(java.lang.String name) throws java.util.NoSuchElementException {
    for (int i = 0; i < (TDarray.size()); i++) {
        if ((this.getFieldName(i)) == null) {
            if (name == null) {
                throw new java.util.NoSuchElementException();
            }
        }else
            if (this.getFieldName(i).equals(name)) {
                return i;
            }
        
    }
    throw new java.util.NoSuchElementException();
}