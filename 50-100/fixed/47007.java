private boolean hasConflicts(com.onpositive.text.analysis.IToken token) {
    if (!(token.hasConflicts()))
        return false;
    
    int validCount = ((token.getCorrelation()) > (com.onpositive.text.analisys.tests.WordFormParserTest.E)) ? 1 : 0;
    java.util.List<com.onpositive.text.analysis.IToken> conflicts = token.getConflicts();
    for (com.onpositive.text.analysis.IToken conflictToken : conflicts) {
        if ((conflictToken.getCorrelation()) > (com.onpositive.text.analisys.tests.WordFormParserTest.E)) {
            validCount++;
        }
    }
    return validCount > 1;
}