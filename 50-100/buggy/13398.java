private boolean executeDUMP_STACK() {
    if (!(com.rfo.basic.Run.Debug))
        return true;
    
    int stackIndex = getStackIndexArg();
    if (stackIndex == 0)
        return false;
    
    if (!(checkEOL()))
        return false;
    
    WatchedStack = stackIndex;
    java.util.ArrayList<java.lang.String> lines = dbDoStack("");
    for (java.lang.String line : lines) {
        if (line != null) {
            com.rfo.basic.Run.PrintShow(line);
        }
    }
    com.rfo.basic.Run.PrintShow("....");
    return true;
}