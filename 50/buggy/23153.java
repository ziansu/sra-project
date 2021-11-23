public void addToEnv(slp.FormalsList formals) {
    for (slp.Formals f : formals.formals) {
        slp.SymbolEntry symbolEntry = addDeclaration(slp.Validator.validateType(f.type, this), f.name, f.line);
        symbolEntry.setIsInitialized(true);
    }
}