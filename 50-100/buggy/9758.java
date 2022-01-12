private int simpleComputeNextLineIndentLevel(int indentLevel, java.util.List<groovyjarjarantlr.Token> tokens) {
    int adjust = getOpenVersusCloseBalance(tokens);
    if (adjust > 0)
        indentLevel += getPrefs().getIndentationSize();
    else
        if (adjust < 0)
            indentLevel = indentLevel - (getPrefs().getIndentationSize());
        
    
    return indentLevel;
}