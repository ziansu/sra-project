public synchronized FileTableEntry getFtEnt(int i) {
    if ((i >= 0) && (i < (table.size())))
        return table.elementAt(i);
    
    return null;
}