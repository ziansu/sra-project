public trinity.types.FunctionType getCurrentFunction() throws trinity.CustomExceptions.SymbolNotFoundException {
    return ((trinity.types.FunctionType) (retrieveSymbol("##func")));
}