static void processVariableDecl(wci.frontend.Token token, wci.frontend.SymTabEntry variableId) throws wci.frontend.ParseException {
    wci.frontend.TypeScriptParser.trace_call("processVariableDecl");
    try {
        variableId.setDefinition(DefinitionImpl.VARIABLE);
        variableId.appendLineNumber(token.beginLine);
    } finally {
        wci.frontend.TypeScriptParser.trace_return("processVariableDecl");
    }
}