private void resize(int newSize) {
    long[] oldTable = this.table;
    this.table = new long[newSize];
    for (int i = 0; i < (this.table.length); i++)
        this.table[i] = java.lang.Long.MIN_VALUE;
    
    for (int i = 0; i < (oldTable.length); i++)
        if ((oldTable[i]) != (java.lang.Long.MIN_VALUE))
            insert(oldTable[i]);
        
    
}