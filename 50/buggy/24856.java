public org.metaborg.sdf2table.symbol.Symbol get(org.metaborg.sdf2table.symbol.Symbol symbol) {
    if (symbol == null)
        return null;
    
    org.metaborg.sdf2table.symbol.Symbol s = _symbols.agent(symbol);
    return s;
}