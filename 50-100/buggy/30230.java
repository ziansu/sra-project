public final boolean matchSymbolTable(nez.ast.Tag table, byte[] symbol, boolean onlyTop) {
    for (int i = (stackedSymbolTable.size()) - 1; i >= 0; i--) {
        nez.runtime.SymbolTableEntry s = stackedSymbolTable.ArrayValues[i];
        if ((s.table) == table) {
            if (s.match(symbol)) {
                return true;
            }
            if (onlyTop)
                break;
            
        }
    }
    return false;
}