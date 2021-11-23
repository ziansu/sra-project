private void resize(int newSize) {
    java.lang.Long[] oldTable = this.table;
    this.table = new java.lang.Long[newSize];
    for (int i = 0; i < (this.table.length); i++)
        this.table[i] = null;
    
    for (int i = 0; i < (oldTable.length); i++)
        if ((oldTable[i]) != null)
            insert(oldTable[i]);
        
    
}