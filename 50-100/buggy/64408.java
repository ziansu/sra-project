public com.jantuomi.tunkki.core.parser.datatype.Datatype resolveSymbol(java.lang.String symbol, java.util.List<com.jantuomi.tunkki.core.parser.datatype.Datatype> params) throws com.jantuomi.tunkki.exception.types.TunkkiError {
    if (variables.containsKey(symbol)) {
        return variables.get(symbol);
    }else
        if ((parent) != null) {
            return parent.resolveSymbol(symbol, params);
        }else {
            throw new com.jantuomi.tunkki.exception.types.UndeclaredSymbolTunkkiError((-1), symbol);
        }
    
}