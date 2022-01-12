public SemanticAnalysis.ICTypeInfo validate(java.lang.String className) throws SemanticAnalysis.SemanticAnalysisException {
    SemanticAnalysis.SymbolInfo symbolFound = SemanticAnalysis.SymbolTable.searchSymbolInfoLocallyOrInCurrentClassAndUp(className, name);
    if (symbolFound == null)
        return null;
    
    if (symbolFound instanceof SemanticAnalysis.VariableSymbolInfo) {
        return ((SemanticAnalysis.VariableSymbolInfo) (symbolFound)).variableType;
    }else {
        return null;
    }
}