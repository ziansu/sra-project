public com.jantuomi.tunkki.core.parser.datatype.Datatype resolveSymbol(java.lang.String symbol) throws com.jantuomi.tunkki.exception.types.TunkkiError {
    if (variables.containsKey(symbol)) {
        return variables.get(symbol);
    }else
        if ((parent) != null) {
            return parent.resolveSymbol(symbol);
        }else {
            throw new com.jantuomi.tunkki.exception.types.UndeclaredSymbolTunkkiError((-1), symbol);
        }
    
}