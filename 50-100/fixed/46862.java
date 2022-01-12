public java.util.ArrayList<org.ballerinalang.composer.service.workspace.langserver.dto.CompletionItem> getCompletionItems(org.ballerinalang.composer.service.workspace.suggetions.SuggestionsFilterDataModel dataModel, java.util.ArrayList<org.ballerinalang.composer.service.workspace.langserver.SymbolInfo> symbols) {
    org.wso2.ballerinalang.compiler.tree.BLangNode symbolEnvNode = dataModel.getSymbolEnvNode();
    if (symbolEnvNode == null) {
        return resolveCommandExecutor.resolveCompletionItems(null, dataModel, symbols);
    }else
        if (symbolEnvNode instanceof org.wso2.ballerinalang.compiler.tree.statements.BLangBlockStmt) {
            return resolveCommandExecutor.resolveCompletionItems(org.ballerinalang.composer.service.workspace.langserver.util.resolvers.CallableUnitBodyContextResolver.class, dataModel, symbols);
        }else {
            return resolveCommandExecutor.resolveCompletionItems(symbolEnvNode.getClass(), dataModel, symbols);
        }
    
}