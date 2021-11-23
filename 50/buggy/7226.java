public boolean isMoreTextNeeded() {
    if ((lexicalState) == (qcfcs_parsing.LexicalAnalyser.EnumLexicalState.lexicalStateStart))
        return true;
    
    return false;
}