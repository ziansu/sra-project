public java.lang.Boolean matchConstructs(java.util.List<unc.cs.symbolTable.STMethod> anSTMethods, java.lang.String aConstruct, java.util.List<com.puppycrawl.tools.checkstyle.api.DetailAST> aMatchedNodes) {
    boolean foundNull = false;
    for (unc.cs.symbolTable.STMethod anSTMethod : anSTMethods) {
        java.lang.Boolean aMatch = matchConstruct(anSTMethod, anSTMethod.getAST(), aConstruct, aMatchedNodes);
        if (aMatch == null) {
            foundNull = true;
        }else
            if (aMatch) {
                return true;
            }
        
    }
    if (foundNull)
        return null;
    
    return false;
}