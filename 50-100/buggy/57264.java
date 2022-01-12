public SemanticAnalysis.ICTypeInfo validate(java.lang.String className) throws SemanticAnalysis.SemanticAnalysisException {
    SemanticAnalysis.SymbolInfo symbolFound = SemanticAnalysis.SymbolTable.searchSymbolInfoLocallyOrInCurrentClassAndUp(className, name);
    if (symbolFound == null)
        return null;
    
    if ((symbolFound.getSymbolType()) == (SymbolInfo.SymbolType.SYMBOL_TYPE_VARIABLE))
        return null;
    
    return ((SemanticAnalysis.VariableSymbolInfo) (symbolFound)).variableType;
}