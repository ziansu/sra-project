private int getScoreFromSymbol(java.lang.String symbol) throws project.NotParseableException {
    char cSymbol = 0;
    if ((symbol.length()) == 2)
        cSymbol = symbol.charAt(0);
    else
        if ((symbol.length()) == 3)
            cSymbol = 'T';
        else
            throw new project.NotParseableException("symbol received is too long");
        
    
    return project.Card.scores[new java.lang.String(project.Card.symbols).indexOf(cSymbol)];
}