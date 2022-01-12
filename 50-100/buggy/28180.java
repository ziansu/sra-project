public int getVarIndex(java.lang.String varName) {
    com.jaamsim.input.ExpParser.ParseClosure topClose = closureStack.get(((closureStack.size()) - 1));
    if (topClose.boundVars.contains(varName)) {
        return topClose.boundVars.indexOf(varName);
    }
    assert topClose.boundVars.contains(varName);
    return (topClose.freeVars.indexOf(varName)) + (topClose.boundVars.size());
}