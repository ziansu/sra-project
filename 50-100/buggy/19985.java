private boolean checkSemanticCorrectness(ql.astnodes.Form qlAST, ql.semanticchecker.messagehandling.MessageData messages) {
    java.util.Map<java.lang.String, ql.astnodes.types.Type> identifierToTypeMap = new java.util.HashMap<>();
    new ql.semanticchecker.IdentifierChecker(qlAST, identifierToTypeMap, messages);
    new ql.semanticchecker.TypeChecker(qlAST, identifierToTypeMap, messages);
    if (messages.containsNoWarnings()) {
        for (ql.semanticchecker.messagehandling.Message warning : messages.getWarnings()) {
            java.lang.System.out.println(warning.getMessage());
        }
    }
    return messages.containsNoErrors();
}