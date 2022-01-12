public org.metaborg.sdf2table.symbol.Symbol get(org.metaborg.sdf2table.symbol.Symbol symbol, boolean create) {
    org.metaborg.sdf2table.symbol.Symbol s = get(symbol);
    if (((s == null) && (symbol != null)) && create)
        _symbols.add((s = symbol));
    
    return s;
}