public synchronized FileTableEntry getFtEnt(int i) {
    if ((i >= 0) && (i < (table.length)))
        return table.elementAt(i);
    
    return null;
}