private void addWorkerSymbol(org.ballerinalang.model.Worker worker) {
    org.ballerinalang.model.SymbolName symbolName = worker.getSymbolName();
    org.ballerinalang.model.symbols.BLangSymbol varSymbol = currentScope.resolve(symbolName);
    if (varSymbol != null) {
        org.ballerinalang.util.exceptions.BLangExceptionHelper.throwSemanticError(worker, SemanticErrors.REDECLARED_SYMBOL, worker.getName());
    }
    currentScope.define(symbolName, worker);
}