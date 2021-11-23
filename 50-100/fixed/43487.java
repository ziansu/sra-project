private int getFreePos() {
    if ((nodes.length) == 0)
        return -1;
    
    while ((lastFree) >= 0) {
        org.squiddev.cobalt.LuaTable.Node last = nodes[((lastFree)--)];
        if (last.key().isNil()) {
            return (lastFree) + 1;
        }
    } 
    return -1;
}