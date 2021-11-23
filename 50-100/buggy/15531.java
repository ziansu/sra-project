public org.metaborg.sdf2table.symbol.Symbol get(org.metaborg.sdf2table.symbol.Symbol symbol, boolean create) {
    if (symbol == null)
        return null;
    
    org.metaborg.sdf2table.symbol.Symbol s = get(symbol);
    if ((s == null) && create)
        _symbols.add((s = symbol));
    
    return s;
}